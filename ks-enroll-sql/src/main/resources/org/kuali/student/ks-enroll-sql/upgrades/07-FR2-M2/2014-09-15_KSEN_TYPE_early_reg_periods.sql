--  KSENROLL-14855: appointment window ref data -- milestones

-- Early Registration Period
INSERT INTO KSEN_TYPE (CREATEID, CREATETIME, DESCR_FORMATTED, DESCR_PLAIN, EFF_DT, NAME, OBJ_ID, REF_OBJECT_URI,
                       SERVICE_URI, TYPE_KEY, VER_NBR)
  VALUES ('SYSTEMLOADER', TO_DATE( '20120309000000', 'YYYYMMDDHH24MISS' ), 'Early Registration Period',
          'Early Registration Period', TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ), 'Early Registration Period',
          '031F39F1883B13BBE050007F010115A6', 'http://student.kuali.org/wsdl/atp/MilestoneInfo',
          'http://student.kuali.org/wsdl/atp/AtpService', 'kuali.atp.milestone.earlyregistrationperiod', 0)
/

-- Non Appointment Registration Period
INSERT INTO KSEN_TYPE (CREATEID, CREATETIME, DESCR_FORMATTED, DESCR_PLAIN, EFF_DT, NAME, OBJ_ID, REF_OBJECT_URI,
                       SERVICE_URI, TYPE_KEY, VER_NBR)
  VALUES ('SYSTEMLOADER', TO_DATE( '20120510000000', 'YYYYMMDDHH24MISS' ), 'Non Appointment Registration Period',
          'Non Appointment Registration Period', TO_DATE( '20000101000000', 'YYYYMMDDHH24MISS' ),
          'Non Appointment Registration Period', '031F39F1883C13BBE050007F010115A6',
          'http://student.kuali.org/wsdl/atp/MilestoneInfo', 'http://student.kuali.org/wsdl/atp/AtpService',
          'kuali.atp.milestone.earlyregistrationperiod.nonappointment', 0)
/

-- Fall 2012
insert into KSEN_MSTONE (OBJ_ID, VER_NBR, CREATEID, CREATETIME, UPDATEID, UPDATETIME, MSTONE_STATE, MSTONE_TYPE,
                         DESCR_FORMATTED, DESCR_PLAIN, IS_ALL_DAY, IS_DATE_RANGE, IS_INSTRCT_DAY, IS_RELATIVE,
                         NAME, RELATIVE_ANCHOR_MSTONE_ID, START_DT, END_DT, ID)
  values ('031F39F1-883E-13BB-E050-007F010115A6', 0, 'admin', TO_DATE('2014-09-15', 'YYYY-MM-DD'), 'admin',
          TO_DATE('2014-09-15', 'YYYY-MM-DD'), 'kuali.milestone.state.Draft',
          'kuali.atp.milestone.earlyregistrationperiod', '', 'test', '1', '1', '0', '0', 'Early Registration Period',
          '', TIMESTAMP '2012-03-10 00:00:00.0', TIMESTAMP '2012-05-10 23:59:59.9',
          '031F39F1-883D-13BB-E050-007F010115A6')
/
insert into KSEN_MSTONE (OBJ_ID, VER_NBR, CREATEID, CREATETIME, UPDATEID, UPDATETIME, MSTONE_STATE, MSTONE_TYPE,
                         DESCR_FORMATTED, DESCR_PLAIN, IS_ALL_DAY, IS_DATE_RANGE, IS_INSTRCT_DAY, IS_RELATIVE,
                         NAME, RELATIVE_ANCHOR_MSTONE_ID, START_DT, END_DT, ID)
  values ('031F39F1-8840-13BB-E050-007F010115A6', 0, 'admin', TO_DATE('2014-09-15', 'YYYY-MM-DD'), 'admin',
          TO_DATE('2014-09-15', 'YYYY-MM-DD'), 'kuali.milestone.state.Draft',
          'kuali.atp.milestone.earlyregistrationperiod.nonappointment', '', 'test', '1', '1', '0', '0',
          'Non Appointment Registration Period', '', TIMESTAMP '2012-05-11 00:00:00.0',
          TIMESTAMP '2012-08-28 23:59:59.9', '031F39F1-883F-13BB-E050-007F010115A6')
/
