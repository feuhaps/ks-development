TRUNCATE TABLE KSCO_COMMENT_TYPE DROP STORAGE
/
INSERT INTO KSCO_COMMENT_TYPE (EFF_DT,EXPIR_DT,NAME,TYPE_DESC,TYPE_KEY)
  VALUES (TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ),TO_DATE( '20001231000000', 'YYYYMMDDHH24MISS' ),'Proposal','Credit Course Proposal','commentType.kuali.lu.type.CreditCourse.draft')
/
INSERT INTO KSCO_COMMENT_TYPE (EFF_DT,EXPIR_DT,NAME,TYPE_DESC,TYPE_KEY)
  VALUES (TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ),TO_DATE( '20001231000000', 'YYYYMMDDHH24MISS' ),'Submitted','Credit Course Submitted','commentType.kuali.lu.type.CreditCourse.submitted')
/
INSERT INTO KSCO_COMMENT_TYPE (EFF_DT,EXPIR_DT,NAME,TYPE_DESC,TYPE_KEY)
  VALUES (TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ),TO_DATE( '20001231000000', 'YYYYMMDDHH24MISS' ),'Comment 1','A Basic Comment 1','commentType.type1')
/
INSERT INTO KSCO_COMMENT_TYPE (EFF_DT,EXPIR_DT,NAME,TYPE_DESC,TYPE_KEY)
  VALUES (TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ),TO_DATE( '20001231000000', 'YYYYMMDDHH24MISS' ),'Comment 2','A Basic Comment 2','commentType.type2')
/
