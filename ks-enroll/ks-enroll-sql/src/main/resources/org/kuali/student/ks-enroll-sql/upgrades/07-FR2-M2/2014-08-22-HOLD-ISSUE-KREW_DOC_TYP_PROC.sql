--
INSERT INTO KREW_DOC_TYP_PROC_T (DOC_TYP_PROC_ID, DOC_TYP_ID, INIT_RTE_NODE_ID, NM, INIT_IND, VER_NBR)
  VALUES ('KS-55773', (select DOC_TYP_ID from KREW_DOC_TYP_T where DOC_TYP_NM='HoldIssueMaintenanceDocument' and CUR_IND=1), '', 'PRIMARY', 1, 1)
/