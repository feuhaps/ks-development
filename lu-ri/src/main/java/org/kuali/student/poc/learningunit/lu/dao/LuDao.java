package org.kuali.student.poc.learningunit.lu.dao;

import java.util.List;
import java.util.Set;

import org.kuali.student.poc.learningunit.lu.entity.Atp;
import org.kuali.student.poc.learningunit.lu.entity.Clu;
import org.kuali.student.poc.learningunit.lu.entity.CluRelation;
import org.kuali.student.poc.learningunit.lu.entity.CluSet;
import org.kuali.student.poc.learningunit.lu.entity.LuRelationType;
import org.kuali.student.poc.learningunit.lu.entity.LuType;
import org.kuali.student.poc.learningunit.lu.entity.Lui;
import org.kuali.student.poc.learningunit.lu.entity.LuiRelation;
import org.kuali.student.poc.xsd.learningunit.lu.dto.LuiCriteria;

public interface LuDao {
	public Clu createClu(Clu clu);

	public Atp createAtp(Atp atp);

	public LuType createLuType(LuType luType);

	public Lui createLui(Lui lui);

	public LuiRelation createLuiRelation(LuiRelation luiRelation);

	public LuRelationType createLuRelationType(LuRelationType luRelationType);

	public CluRelation createCluRelation(CluRelation cluRelation);

	public CluSet createCluSet(CluSet cluSet);

	public boolean deleteClu(Clu clu);

	public boolean deleteCluRelation(CluRelation cluRelation);

	public boolean deleteCluSet(CluSet cluSet);

	public boolean deleteLui(Lui lui);

	public boolean deleteLuiRelation(LuiRelation luiRelation);

	public Clu updateClu(Clu clu);

	public CluRelation updateCluRelation(CluRelation cluRelation);

	public CluSet updateCluSet(CluSet cluSet);

	public Lui updateLui(Lui lui);

	public LuiRelation updateLuiRelation(LuiRelation luiRelation);

	public List<LuType> findLuTypes();

	public List<LuRelationType> findLuRelationTypes();

	public LuType fetchLuType(String luTypeId);

	public Set<LuRelationType> findAllowedLuLuRelationTypesForLuType(
			String luTypeId, String relatedLuTypeId);

	public Set<LuRelationType> findAllowedLuRelationTypesForClu(String cluId,
			String relatedCluId);

	public Set<LuRelationType> findAllowedLuRelationTypesForLui(String luiId,
			String relatedLuiId);
	
	public Atp fetchAtp(String atpId);

	public Clu fetchClu(String cluId);

	public CluSet fetchCluSet(String cluSetId);

	public Lui fetchLui(String luiId);

	public List<Lui> findLuisForClu(String cluId, String atpId);

	public LuiRelation fetchLuiRelation(String luiId, String relatedLuiId,
			String luRelationTypeId);

	public CluRelation fetchCluRelation(String cluId, String relatedCluId,
			String luRelationTypeId);

	public List<Clu> findClusForLuType(String luTypeId);

	public List<Lui> searchForLuis(LuiCriteria luiCriteria);

}
