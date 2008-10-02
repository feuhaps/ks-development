/**
 * 
 */
package org.kuali.student.rules.devgui.server.impl;

import java.util.ArrayList;
import java.util.List;

import org.kuali.student.rules.devgui.client.model.RuleTypesHierarchyInfo;
import org.kuali.student.rules.devgui.client.model.RulesHierarchyInfo;
import org.kuali.student.rules.devgui.client.service.DevelopersGuiService;
import org.kuali.student.rules.rulemanagement.dto.BusinessRuleInfoDTO;
import org.kuali.student.rules.rulemanagement.dto.BusinessRuleTypeDTO;
import org.kuali.student.rules.rulemanagement.dto.StatusDTO;
import org.kuali.student.rules.rulemanagement.service.RuleManagementService;

/**
 * @author zzraly
 */
public class DevelopersGuiServiceImpl implements DevelopersGuiService {

    RuleManagementService ruleManagementService;

    public String createBusinessRule(BusinessRuleInfoDTO businessRuleInfo) {

        String new_rule_id = null;

        try {
            new_rule_id = ruleManagementService.createBusinessRule(businessRuleInfo);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to create business rule ID: " + businessRuleInfo.getBusinessRuleId(), ex); // TODO
        }
        return new_rule_id;
    }

    public StatusDTO updateBusinessRule(String businessRuleId, BusinessRuleInfoDTO businessRuleInfo) {
        StatusDTO rule_update_status = null;

        try {
            rule_update_status = ruleManagementService.updateBusinessRule(businessRuleId, businessRuleInfo);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to create business rule ID: " + businessRuleInfo.getBusinessRuleId(), ex); // TODO
        }
        return rule_update_status;
    }

    // populate Business Rule Types tree
    public List<RuleTypesHierarchyInfo> findRuleTypesHierarchyInfo() {
        List<RuleTypesHierarchyInfo> ruleTypesInfo = new ArrayList<RuleTypesHierarchyInfo>();

        // 1. retrieve agendas
        List<String> agendaTypes = new ArrayList<String>();
        try {
            agendaTypes = ruleManagementService.findAgendaTypes();
        } catch (Exception ex) {
            throw new RuntimeException("Unable to get agenda types", ex); // TODO
        }

        // TODO show 'empty' node in the rule types tree if none exist?
        if (agendaTypes == null) {
            throw new RuntimeException("Unable to get agenda types for Rule Types Tree.");
        }

        // 2. for each agenda type, retrieve business rule types
        for (String agendaTypeKey : agendaTypes) {

            // 3. retrieve business rule types
            List<String> businessRuleTypes = new ArrayList<String>();
            try {
                System.out.println("DEBUG findRuleTypesHierarchyInfo(): " + agendaTypeKey);
                businessRuleTypes = ruleManagementService.findBusinessRuleTypesByAgendaType(agendaTypeKey);
            } catch (Exception ex) {
                throw new RuntimeException("Unable to get business rule types", ex); // TODO
            }

            // TODO show 'empty' node in the rule types tree if none exist?
            if (businessRuleTypes == null) {
                ruleTypesInfo.add(createTypesHierarchyInfoObject(agendaTypeKey, ""));
                System.out.println("DEBUG findRuleTypesHierarchyInfo(): no business rule types for Agenda Type " + agendaTypeKey);
                continue;
            }

            for (String businessRuleTypeKey : businessRuleTypes) {
                ruleTypesInfo.add(createTypesHierarchyInfoObject(agendaTypeKey, businessRuleTypeKey));
            }
        }

        return ruleTypesInfo;
    }

    private RuleTypesHierarchyInfo createTypesHierarchyInfoObject(String agendaType, String businessRuleType) {
        RuleTypesHierarchyInfo ruleInfo = new RuleTypesHierarchyInfo();

        ruleInfo.setAgendaType(agendaType);
        ruleInfo.setBusinessRuleTypeKey(businessRuleType);

        return ruleInfo;
    }

    // populate rules tree
    public List<RulesHierarchyInfo> findRulesHierarchyInfo() {

        List<RulesHierarchyInfo> rulesInfo = new ArrayList<RulesHierarchyInfo>();

        // 1. retrieve agendas
        List<String> agendaTypes = new ArrayList<String>();
        try {
            agendaTypes = ruleManagementService.findAgendaTypes();
        } catch (Exception ex) {
            throw new RuntimeException("Unable to get Agenda Types", ex); // TODO
        }

        // TODO show 'empty' node in the rule types tree if none exist?
        if (agendaTypes == null) {
            throw new RuntimeException("Received zero Agenda Types for Rules Tree.");
        }

        // 2. for each agenda type, retrieve business rule types and business rules
        for (String agendaTypeKey : agendaTypes) {

            // 3. retrieve business rule types
            List<String> businessRuleTypes = new ArrayList<String>();
            try {
                System.out.println("DEBUG findRulesHierarchyInfo(): " + agendaTypeKey);
                businessRuleTypes = ruleManagementService.findBusinessRuleTypesByAgendaType(agendaTypeKey);
            } catch (Exception ex) {
                throw new RuntimeException("Unable to get business rule types", ex); // TODO
            }

            // TODO show 'empty' node in the rules tree if none exist?
            if (businessRuleTypes == null) {
                rulesInfo.add(createHierarchyInfoObject(agendaTypeKey, "", "", "", ""));
                continue;
            }

            // 4. find individual business rules
            List<String> businessRuleIds = new ArrayList<String>();
            for (String businessRuleTypeKey : businessRuleTypes) {

                try {
                    businessRuleIds = ruleManagementService.findBusinessRuleIdsByBusinessRuleType(businessRuleTypeKey);
                } catch (Exception ex) {
                    throw new RuntimeException("Unable to get business rule ids", ex); // TODO
                }

                // TODO show 'empty' node in the rules tree if none exist?
                if (businessRuleIds == null) {
                    rulesInfo.add(createHierarchyInfoObject(agendaTypeKey, businessRuleTypeKey, "", "", ""));
                    System.out.println("DEBUG findRulesHierarchyInfo(): no business rules for Business Rule Type: " + businessRuleTypeKey);
                    continue;
                }

                // 5. go through individual business rules
                BusinessRuleInfoDTO businessRule;
                for (String businessRuleId : businessRuleIds) {

                    try {
                        businessRule = ruleManagementService.fetchDetailedBusinessRuleInfo(businessRuleId);
                    } catch (Exception ex) {
                        throw new RuntimeException("Unable to get business rule hame", ex); // TODO
                    }

                    rulesInfo.add(createHierarchyInfoObject(agendaTypeKey, businessRuleTypeKey, businessRuleId, businessRule.getName(), businessRule.getAnchorValue()));
                }
            }

            System.out.println("DEBUG: rule info:" + rulesInfo.toString());
        } // next agenda type

        return rulesInfo;
    }

    private RulesHierarchyInfo createHierarchyInfoObject(String agendaType, String businessRuleType, String ruleId, String ruleName, String anchor) {
        RulesHierarchyInfo ruleInfo = new RulesHierarchyInfo();

        ruleInfo.setAgendaType(agendaType);
        ruleInfo.setBusinessRuleType(businessRuleType);
        ruleInfo.setBusinessRuleId(ruleId);
        ruleInfo.setBusinessRuleName(ruleName);
        ruleInfo.setAnchor(anchor);

        return ruleInfo;
    }

    public BusinessRuleInfoDTO fetchDetailedBusinessRuleInfo(String ruleId) {

        BusinessRuleInfoDTO businessRuleInfo;

        try {
            businessRuleInfo = ruleManagementService.fetchDetailedBusinessRuleInfo(ruleId);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to get agenda types", ex);
        }

        return businessRuleInfo;
    }

    public BusinessRuleTypeDTO fetchBusinessRuleType(String ruleTypeKey, String anchorTypeKey) {

        BusinessRuleTypeDTO businessRuleType;

        try {
            businessRuleType = ruleManagementService.fetchBusinessRuleType(ruleTypeKey, anchorTypeKey);
        } catch (Exception ex) {
            throw new RuntimeException("Unable to get agenda types", ex);
        }

        return businessRuleType;
    }

    public String testBusinessRule(String businessRuleId) {
        return "TEST result"; // TODO
    }

    /**
     * @return the ruleManagementService
     */
    public final RuleManagementService getRuleManagementService() {
        return ruleManagementService;
    }

    /**
     * @param ruleManagementService
     *            the ruleManagementService to set
     */
    public final void setRuleManagementService(RuleManagementService ruleManagementService) {
        this.ruleManagementService = ruleManagementService;
    }
}