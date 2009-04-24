// LU LU RelationType
INSERT INTO KSLU_LULU_RELTN_TYPE (ID, NAME, DESCR, REV_NAME, REV_DESC, EFF_DT, EXPIR_DT, VERSIONIND) values ('luLuType.type1', 'bob', 'my desc1', 'rev name1', 'rev desc1', {ts '2008-01-01 00:00:00.0'}, {ts '2010-01-01 00:00:00.0'}, 0)
/
INSERT INTO KSLU_LULU_RELTN_TYPE (ID, NAME, DESCR, REV_NAME, REV_DESC, EFF_DT, EXPIR_DT, VERSIONIND) values ('luLuType.type2', 'santiago', 'my desc2', 'rev name2', 'rev desc2', {ts '2008-01-01 00:00:00.0'}, {ts '2010-01-01 00:00:00.0'}, 0)
/
INSERT INTO KSLU_LULU_RELTN_TYPE (ID, NAME, DESCR, REV_NAME, REV_DESC, EFF_DT, EXPIR_DT, VERSIONIND) values ('luLuType.type3', 'manolin', 'my desc3', 'rev name3', 'rev desc3', {ts '2008-01-01 00:00:00.0'}, {ts '2010-01-01 00:00:00.0'}, 0)
/

// LU Type
INSERT INTO KSLU_LUTYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('luType.shell.course', 'A Shell Course', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Course')
/
INSERT INTO KSLU_LUTYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('luType.shell.program', 'A Shell Program', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Program')
/


// CluInstructor
INSERT INTO KSLU_CLU_INSTR (ID, ORG_ID, PERS_ID) VALUES ('INSTR-1', 'ORG-1', 'PersonID')
/
INSERT INTO KSLU_CLU_INSTR (ID, ORG_ID, PERS_ID) VALUES ('INSTR-2', 'ORG-2', 'PersonID')
/

// CluPublishing
INSERT INTO KSLU_CLU_PUBL (ID, END_CYCLE, START_CYCLE, ST, TYPE, PRI_INSTR_ID) VALUES ('PUBL-1', 'Fall', 'Spring', 'State', 'Type', 'INSTR-1')
/
INSERT INTO KSLU_CLU_PUBL (ID, END_CYCLE, START_CYCLE, ST, TYPE, PRI_INSTR_ID) VALUES ('PUBL-2', 'Fall', 'Summer', 'State', 'Type', 'INSTR-2')
/

// RichText
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-1', '<p>Desc</p>', 'Desc')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-2', '<p>Marketing Desc</p>', 'Marketing Desc')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-3', '<p>Desc2</p>', 'Desc2')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-4', '<p>Marketing Desc2</p>', 'Marketing Desc2')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-5', '<p>Core CluSet</p>', 'Core CluSet')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-6', '<p>CoreEnglish CluSet</p>', 'CoreEnglish CluSet')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-7', '<p>First year science CluSet</p>', 'First year science CluSet')
/
INSERT INTO KS_RICH_TEXT_T (ID, FORMATTED, PLAIN) VALUES ('RICHTEXT-8', '<p>First year arts CluSet</p>', 'First year arts CluSet')
/

// CluIdentifier
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-1', 'Code-1', 'Division-1', 'Level-1', 'Long Name-1', 'Shortname-1', 'State-1', 'Type-1', 'Variation-1')
/
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-2', 'Code-2', 'Division-2', 'Level-2', 'Long Name-2', 'Shortname-2', 'State-2', 'Type-2', 'Variation-2')
/
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-3', 'Code-3', 'Division-3', 'Level-3', 'Long Name-3', 'Shortname-3', 'State-3', 'Type-3', 'Variation-3')
/
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-4', 'Code-4', 'Division-4', 'Level-4', 'Long Name-4', 'Shortname-4', 'State-4', 'Type-4', 'Variation-4')
/

// CluCredit
INSERT INTO KSLU_CLU_CR (ID, INSTR_UNIT, MAX_ALOW_INACV_ATP, MAX_ALOW_INACV_TMQ, MAX_TM_RSLT_RCGZ_ATP, MAX_TM_RSLT_RCGZ_TMQ, MAX_TM_TO_COMP_ATP, MAX_TM_TO_COMP_TMQ, MAX_TOT_UNIT, MIN_TM_TO_COMP_ATP, MIN_TM_TO_COMP_TMQ, MIN_TOT_UNIT, REPEAT_CNT, REPEAT_TM_ATP, REPEAT_TM_TMQ, REPEAT_UNIT) VALUES ('CR-1', 0, 'ATP-INACT-1', 0, 'ATP-RECOG-1', 0, 'ATP-MAXCOMPLETE-1', 0, 0, 'ATP-MINCOMPLETE-1', 0, 0, 'Repeat Count', 'ATP-REPEAT-1', 0, 'Repeat Units')
/
INSERT INTO KSLU_CLU_CR (ID, INSTR_UNIT, MAX_ALOW_INACV_ATP, MAX_ALOW_INACV_TMQ, MAX_TM_RSLT_RCGZ_ATP, MAX_TM_RSLT_RCGZ_TMQ, MAX_TM_TO_COMP_ATP, MAX_TM_TO_COMP_TMQ, MAX_TOT_UNIT, MIN_TM_TO_COMP_ATP, MIN_TM_TO_COMP_TMQ, MIN_TOT_UNIT, REPEAT_CNT, REPEAT_TM_ATP, REPEAT_TM_TMQ, REPEAT_UNIT) VALUES ('CR-2', 0, 'ATP-INACT-2', 0, 'ATP-RECOG-2', 0, 'ATP-MAXCOMPLETE-2', 0, 0, 'ATP-MINCOMPLETE-2', 0, 0, 'Repeat Count', 'ATP-REPEAT-2', 0, 'Repeat Units')
/

// CluAccounting
INSERT INTO KSLU_CLU_ACCT (ID) VALUES ('ACCT-1')
/
INSERT INTO KSLU_CLU_ACCT (ID) VALUES ('ACCT-2')
/

// CluFee
INSERT INTO KSLU_CLU_FEE (ID) VALUES ('FEE-1')
/
INSERT INTO KSLU_CLU_FEE (ID) VALUES ('FEE-2')
/

// Clu
insert into KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE1', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-1', 'CR-1', 'RICHTEXT-1', 'FEE-1', 'luType.shell.course', 'RICHTEXT-2', 'IDENT-1', 'INSTR-1', 'PUBL-1')
/
insert into KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE2', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-2', 'CR-2', 'RICHTEXT-2', 'FEE-2', 'luType.shell.program', 'RICHTEXT-2', 'IDENT-2', 'INSTR-2', 'PUBL-2')
/
insert into KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE2', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-2', 'CR-2', 'RICHTEXT-2', 'FEE-2', 'luType.shell.course', 'RICHTEXT-2', 'IDENT-3', 'INSTR-2', 'PUBL-2')
/
insert into KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-4', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE1', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-1', 'CR-1', 'RICHTEXT-1', 'FEE-1', 'luType.shell.course', 'RICHTEXT-2', 'IDENT-4', 'INSTR-1', 'PUBL-1')
/


//Lui
insert into KSLU_LUI (ID, CLU_ID, ATP_ID, LUI_CODE, MAX_SEATS, EFF_DT, EXP_DT, ST, VERSIONIND) values ('LUI-1', 'CLU-1', 'ATP-1', 'MENG 329 section 101', 50, {ts '2000-01-01 00:00:00.0'}, {ts '2000-06-01 00:00:00.0'}, 'Approved', 1)
/
insert into KSLU_LUI (ID, CLU_ID, ATP_ID, LUI_CODE, MAX_SEATS, EFF_DT, EXP_DT, ST, VERSIONIND) values ('LUI-2', 'CLU-1', 'ATP-2', 'MENG 329 section 102', 75, {ts '2000-08-25 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Approved', 1)
/
insert into KSLU_LUI (ID, CLU_ID, ATP_ID, LUI_CODE, MAX_SEATS, EFF_DT, EXP_DT, ST, VERSIONIND) values ('LUI-3', 'CLU-1', 'ATP-2', 'MENG 329 section 112', 75, {ts '2000-08-25 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Activated', 1)
/
insert into KSLU_LUI (ID, CLU_ID, ATP_ID, LUI_CODE, MAX_SEATS, EFF_DT, EXP_DT, ST, VERSIONIND) values ('LUI-4', 'CLU-2', 'ATP-1', 'BENG 471 section 101', 75, {ts '2000-01-01 00:00:00.0'}, {ts '2000-06-01 00:00:00.0'}, 'Retired', 1)
/

// CluAtpTypeKey
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-1', 'atpType.semester.fall')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-2', 'atpType.semester.spring')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-3', 'atpType.semester.summer')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-4', 'atpType.quarter.fall')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-5', 'atpType.quarter.winter')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-6', 'atpType.quarter.spring')
/
insert into KSLU_CLU_ATP_TYPE_KEY (ID, ATP_TYPE_KEY) values ('ATP-7', 'atpType.quarter.summer')
/

// CluSet
INSERT INTO KSLU_CLU_SET (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, EFF_DT, EXPIR_DT, NAME, RT_DESCR_ID, CRIT_SET) VALUES ('CLUSET-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, {ts '2003-01-01 00:00:00.0'}, {ts '2004-01-01 00:00:00.0'}, 'Core Cluset Name', 'RICHTEXT-5', 0)
/
INSERT INTO KSLU_CLU_SET (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, EFF_DT, EXPIR_DT, NAME, RT_DESCR_ID, CRIT_SET) VALUES ('CLUSET-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, {ts '2003-01-01 00:00:00.0'}, {ts '2004-01-01 00:00:00.0'}, 'Core English Cluset Name', 'RICHTEXT-6', 0)
/
INSERT INTO KSLU_CLU_SET (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, EFF_DT, EXPIR_DT, NAME, RT_DESCR_ID, CRIT_SET) VALUES ('CLUSET-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, {ts '2003-01-01 00:00:00.0'}, {ts '2004-01-01 00:00:00.0'}, 'First year science CluSet', 'RICHTEXT-7', 0)
/
INSERT INTO KSLU_CLU_SET (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, EFF_DT, EXPIR_DT, NAME, RT_DESCR_ID, CRIT_SET) VALUES ('CLUSET-4', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, {ts '2003-01-01 00:00:00.0'}, {ts '2004-01-01 00:00:00.0'}, 'First year arts CluSet', 'RICHTEXT-8', 0)
/

// Clu <-> CluSet join
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-2', 'CLU-1')
/
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-2', 'CLU-3')
/
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-3', 'CLU-2')
/
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-4', 'CLU-2')
/
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-4', 'CLU-3')
/

// CluSet <-> CluSet join
INSERT INTO KSLU_CLU_SET_JN_CLU_SET (CLU_SET_PARENT_ID, CLU_SET_CHILD_ID) VALUES ('CLUSET-2', 'CLUSET-3')
/
INSERT INTO KSLU_CLU_SET_JN_CLU_SET (CLU_SET_PARENT_ID, CLU_SET_CHILD_ID) VALUES ('CLUSET-1', 'CLUSET-2')
/
INSERT INTO KSLU_CLU_SET_JN_CLU_SET (CLU_SET_PARENT_ID, CLU_SET_CHILD_ID) VALUES ('CLUSET-2', 'CLUSET-4')
/

//STATEMENT TYPES
INSERT INTO KSLU_STMT_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.luStatementType.createCourseAcademicReadiness', 'Rules used in the evaluation of a person''s academic readiness for enrollment in an LU.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Overall Academic Readiness Rules')
INSERT INTO KSLU_STMT_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.luStatementType.prereqAcademicReadiness', 'Pre req rules used in the evaluation of a person''s academic readiness for enrollment in an LU.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Academic Readiness Pre Reqs')
INSERT INTO KSLU_STMT_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.luStatementType.coreqAcademicReadiness', 'Co req used in the evaluation of a person''s academic readiness for enrollment in an LU.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Academic Readiness Co Reqs')

// REQUIREMENT TYPES
INSERT INTO KSLU_REQ_COM_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.reqCompType.courseList.all', 'Student must have completed all of <reqCompFieldType.cluSet>', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'All of required courses')
INSERT INTO KSLU_REQ_COM_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.reqCompType.courseList.1of2', '<reqCompFieldType.clu> or <reqCompFieldType.clu> course', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'One of two required courses')
INSERT INTO KSLU_REQ_COM_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.reqCompType.courseList.nof', 'Student needs <reqCompFieldType.requiredCount> courses from the following course(s): <reqCompFieldType.cluSet> ', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'N of required courses')
INSERT INTO KSLU_REQ_COM_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.reqCompType.gradecheck', 'Student needs a minimum GPA of <reqCompFieldType.gpa>', {ts '2000-01-01 00:00:00.0'}, {ts '2001-11-30 00:00:00.0'}, 'Minimum overall GPA')
INSERT INTO KSLU_REQ_COM_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) VALUES ('kuali.reqCompType.grdCondCourseList', 'Student needs a <reqCompFieldType.totalCredits> credits from the following course(s): <reqCompFieldType.cluSet>', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Course completed with minimum specified grade')

// REQUIREMENT FIELD TYPES
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.clu', 'CLU', 'CLU','string',null,null,null,null,null,null,null,null,0)
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.cluSet', 'CLUSET', 'CLUSET','string',null,null,null,null,null,null,null,null,0)
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.requiredCount', 'REQUIRED_COUNT', 'Required Count','string',null,null,null,null,null,null,null,null,0)
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.gpa', 'GPA', 'GAP','string',null,null,null,null,null,null,null,null,0)
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.totalCredits', 'TOTAL_CREDITS', 'Total Credits','number',null,null,null,null,null,null,null,null,0)
INSERT INTO KSLU_REQ_COM_FIELD_TYPE (ID, NAME, DESCR, DATA_TYPE, MIN_VALUE, MAX_VALUE, MIN_LENGTH, MAX_LENGTH, VALID_CHARS, INVALID_CHARS, MIN_OCCURS, MAX_OCCURS, READ_ONLY) VALUES ('reqCompFieldType.operator', 'CLU', 'CLU','string',null,null,null,null,null,null,null,null,0)


// REQ_COMP_TYPE -> REQ_COMP_FIELD_TYPE
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.all','reqCompFieldType.cluSet')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.1of2','reqCompFieldType.clu')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.nof','reqCompFieldType.requiredCount')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.nof','reqCompFieldType.operator')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.nof','reqCompFieldType.requiredCount')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.courseList.nof','reqCompFieldType.cluSet')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.gradecheck','reqCompFieldType.gpa')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.grdCondCourseList','reqCompFieldType.totalCredits')
INSERT INTO KSLU_REQCOMTYP_JN_REQCOMFLDTYP (REQ_COMP_TYPE_ID,REQ_COMP_FIELD_TYPE_ID) VALUES ('kuali.reqCompType.grdCondCourseList','reqCompFieldType.cluSet')

// REQ_COMPONENT_TYPE_NL_TEMPLATE
// INSERT INTO KSLU_REQ_COM_TYPE_NL_TMPL (ID, ATTR_NAME, ATTR_VALUE, OWNER) values ('1', 'KUALI.CATALOG', 'COURSE_LIST_CATALOG_VEL_TEMPLATE', 'kuali.reqCompType.courseList.all')
//INSERT INTO KSLU_REQ_COM_TYPE_NL_TMPL (ID, NL_USUAGE_TYPE_KEY, TEMPLATE, OWNER) values ('1', 'KUALI.CATALOG', '#if($cluSet.getCluSet().getClus().size() == $mathTool.toNumber($expectedValue))  Student must have completed all of $cluSet.getCluSetAsString() #else  Student must have completed $expectedValue of $cluSet.getCluSetAsString() #end', 'kuali.reqCompType.courseList.all')
INSERT INTO KSLU_REQ_COM_TYPE_NL_TMPL (ID, NL_USUAGE_TYPE_KEY, TEMPLATE, OWNER) values ('1', 'KUALI.CATALOG', 'Student must have completed all of $cluSet.getCluSetAsString()', 'kuali.reqCompType.courseList.all')
INSERT INTO KSLU_REQ_COM_TYPE_NL_TMPL (ID, NL_USUAGE_TYPE_KEY, TEMPLATE, OWNER) values ('2', 'KUALI.CATALOG', 'Student must have completed $expectedValue of $cluSet.getCluSetAsString()', 'kuali.reqCompType.courseList.nof')

// STMT_TYPE <-> REQ_COM_TYPE
INSERT INTO KSLU_STY_JN_RQTY (LU_STMT_TYPE_ID,REQ_COM_TYPE_ID) values ('kuali.luStatementType.prereqAcademicReadiness','kuali.reqCompType.courseList.all')
INSERT INTO KSLU_STY_JN_RQTY (LU_STMT_TYPE_ID,REQ_COM_TYPE_ID) values ('kuali.luStatementType.prereqAcademicReadiness','kuali.reqCompType.courseList.nof')
INSERT INTO KSLU_STY_JN_RQTY (LU_STMT_TYPE_ID,REQ_COM_TYPE_ID) values ('kuali.luStatementType.prereqAcademicReadiness','kuali.reqCompType.courseList.1of2')
INSERT INTO KSLU_STY_JN_RQTY (LU_STMT_TYPE_ID,REQ_COM_TYPE_ID) values ('kuali.luStatementType.prereqAcademicReadiness','kuali.reqCompType.grdCondCourseList')
INSERT INTO KSLU_STY_JN_RQTY (LU_STMT_TYPE_ID,REQ_COM_TYPE_ID) values ('kuali.luStatementType.prereqAcademicReadiness','kuali.reqCompType.gradecheck')

// STMT_TYPE <-> STMT_TYPE
INSERT INTO KSLU_STY_JN_LUSTY (LU_STMT_TYPE_ID, CHLD_LU_STMT_TYPE_ID) values ('kuali.luStatementType.createCourseAcademicReadiness','kuali.luStatementType.prereqAcademicReadiness')
INSERT INTO KSLU_STY_JN_LUSTY (LU_STMT_TYPE_ID, CHLD_LU_STMT_TYPE_ID) values ('kuali.luStatementType.createCourseAcademicReadiness','kuali.luStatementType.coreqAcademicReadiness')

// LU_STMT
INSERT INTO KSLU_STMT (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, NAME, DESCR, ST, OPERATOR, PARENT_LU_STMT_ID,LU_STMT_TYPE_ID) VALUES ('STMT-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'STMT 1','Statement 1','ACTIVE','AND', null ,'kuali.luStatementType.createCourseAcademicReadiness')
INSERT INTO KSLU_STMT (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, NAME, DESCR, ST, OPERATOR, PARENT_LU_STMT_ID,LU_STMT_TYPE_ID) VALUES ('STMT-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'STMT 2','Statement 2','ACTIVE','AND','STMT-1','kuali.luStatementType.prereqAcademicReadiness')

// REQ COM
INSERT INTO KSLU_REQ_COM (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, DESCR, ST, EFF_DT, EXPIR_DT, REQ_COM_TYPE_ID) VALUES ('REQCOMP-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'Required Component 1','ACTIVE',{ts '2001-01-01 00:00:00.0'},{ts '2002-01-01 00:00:00.0'},'kuali.reqCompType.courseList.all')
INSERT INTO KSLU_REQ_COM (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, DESCR, ST, EFF_DT, EXPIR_DT, REQ_COM_TYPE_ID) VALUES ('REQCOMP-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'Required Component 2','ACTIVE',{ts '2001-01-01 00:00:00.0'},{ts '2002-01-01 00:00:00.0'},'kuali.reqCompType.grdCondCourseList')
INSERT INTO KSLU_REQ_COM (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, DESCR, ST, EFF_DT, EXPIR_DT, REQ_COM_TYPE_ID) VALUES ('REQCOMP-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'Required Component 3','ACTIVE',{ts '2001-01-01 00:00:00.0'},{ts '2002-01-01 00:00:00.0'},'kuali.reqCompType.gradecheck')

// CLU <-> LU STMT
INSERT INTO KSLU_CLU_JN_LU_STMT (CLU_ID, LU_STMT_ID) VALUES ('CLU-1','STMT-1')

// LU STMT <-> REQ COM
INSERT INTO KSLU_STMT_JN_REQ_COM (REQ_COM_ID, LU_STMT_ID) VALUES ('REQCOMP-1','STMT-2')
INSERT INTO KSLU_STMT_JN_REQ_COM (REQ_COM_ID, LU_STMT_ID) VALUES ('REQCOMP-2','STMT-2')
INSERT INTO KSLU_STMT_JN_REQ_COM (REQ_COM_ID, LU_STMT_ID) VALUES ('REQCOMP-3','STMT-2')

// CluCluRelation
INSERT INTO KSLU_CLUCLU_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, CLU_RELTN_REQ, EFF_DT, EXPIR_DT, ST, CLU_ID, LU_RELTN_TYPE_ID, RELATED_CLU_ID) VALUES ('CLUCLUREL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 1, {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active', 'CLU-1', 'luLuType.type1', 'CLU-2')
INSERT INTO KSLU_CLUCLU_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, CLU_RELTN_REQ, EFF_DT, EXPIR_DT, ST, CLU_ID, LU_RELTN_TYPE_ID, RELATED_CLU_ID) VALUES ('CLUCLUREL-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 1, {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active', 'CLU-1', 'luLuType.type1', 'CLU-3')

// LuiLuiRelation
INSERT INTO KSLU_LUILUI_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LUI_ID,RELATED_LUI_ID,LULU_RELTN_TYPE_ID, EFF_DT, EXPIR_DT, ST) VALUES ('LUILUIREL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'LUI-1', 'LUI-2','luLuType.type1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')
INSERT INTO KSLU_LUILUI_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LUI_ID,RELATED_LUI_ID,LULU_RELTN_TYPE_ID, EFF_DT, EXPIR_DT, ST) VALUES ('LUILUIREL-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'LUI-1', 'LUI-3','luLuType.type1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')
INSERT INTO KSLU_LUILUI_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LUI_ID,RELATED_LUI_ID,LULU_RELTN_TYPE_ID, EFF_DT, EXPIR_DT, ST) VALUES ('LUILUIREL-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'LUI-2', 'LUI-4','luLuType.type1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')

// LuDocRelation Type
INSERT INTO KSLU_LU_DOC_RELTN_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('luDocRelationType.doctype1', 'Doc Type 1', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'DT1')
INSERT INTO KSLU_LU_DOC_RELTN_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('luDocRelationType.doctype2', 'Doc Type 2', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'DT2')

// LuDocRelation
INSERT INTO KSLU_LU_DOC_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LU_DOC_RELTN_TYPE_ID, CLU_ID, DOC_ID, TITLE, EFF_DT, EXPIR_DT, ST) VALUES ('LUDOCREL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'luDocRelationType.doctype1', 'CLU-1', 'DOC-1', 'TITLE1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')
INSERT INTO KSLU_LU_DOC_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LU_DOC_RELTN_TYPE_ID, CLU_ID, DOC_ID, TITLE, EFF_DT, EXPIR_DT, ST) VALUES ('LUDOCREL-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'luDocRelationType.doctype1', 'CLU-1', 'DOC-2', 'TITLE1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')
INSERT INTO KSLU_LU_DOC_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LU_DOC_RELTN_TYPE_ID, CLU_ID, DOC_ID, TITLE, EFF_DT, EXPIR_DT, ST) VALUES ('LUDOCREL-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'luDocRelationType.doctype1', 'CLU-2', 'DOC-1', 'TITLE1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')
INSERT INTO KSLU_LU_DOC_RELTN (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, LU_DOC_RELTN_TYPE_ID, CLU_ID, DOC_ID, TITLE, EFF_DT, EXPIR_DT, ST) VALUES ('LUDOCREL-4', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, 'luDocRelationType.doctype2', 'CLU-2', 'DOC-3', 'TITLE1', {ts '2003-01-01 00:00:00.0'}, {ts '2100-01-01 00:00:00.0'}, 'Active')

// LrType
INSERT INTO KSLU_LR_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('lrType.finalGrade', 'Final learning result for an LU. A stereotypical usage is the final grade in a course.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Final Grade')
INSERT INTO KSLU_LR_TYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('lrType.midtermGrade', 'Midterm learning result for an LU. A stereotypical usage is the midterm grade in a course.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Midterm Grade')


// Natural Language Translation Test Data
// NL - Lu Type
INSERT INTO KSLU_LUTYPE (TYPE_KEY, TYPE_DESC, EFF_DT, EXPIR_DT, NAME) values ('luType.nl.course', 'An NL Course', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'Course')

// NL - Clu - MATH152
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-NL-1', 'MATH152', 'MATH', '152', 'MATH 152 Linear Systems', 'MATH 152', 'State-1', 'Type-1', 'Variation-1')
INSERT INTO KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-NL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE1', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-1', 'CR-1', 'RICHTEXT-1', 'FEE-1', 'luType.nl.course', 'RICHTEXT-2', 'IDENT-NL-1', 'INSTR-1', 'PUBL-1')

// NL - Clu - MATH221
INSERT INTO KSLU_CLU_IDENT (ID, CD, DIV, LVL, LNG_NAME, SHRT_NAME, ST, TYPE, VARTN) VALUES ('IDENT-NL-2', 'MATH221', 'MATH', '221', 'MATH 221 Matrix Algebra', 'MATH 221', 'State-1', 'Type-1', 'Variation-1')
INSERT INTO KSLU_CLU (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, ACCRED_ORG_ID, ADMIN_ORG_ID, CAN_CREATE_LUI, DEF_ENRL_EST, DEF_MAX_ENRL, EFF_DT, EXPIR_DT, HAS_EARLY_DROP_DEDLN, IS_ENRL, IS_HAZR_DISBLD_STU, NEXT_REVIEW_PRD, REF_URL, ST, ATPDURATIONTYPEKEY, TIMEQUANTITY, STDY_SUBJ_AREA, ACCT_ID, CR_ID, RT_DESCR_ID, FEE_ID, LUTYPE_ID, RT_MKTG_DESCR_ID, OFFIC_CLU_ID, PRI_INSTR_ID, PUBL_ID) values ('CLU-NL-2', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 1, 'ACCRED_ORG_ID', 'ADMIN_ORG_ID', 1, 1, 42, {ts '2002-01-01 00:00:00.0'}, {ts '2003-01-01 00:00:00.0'}, 1, 1, 0, 'NEXT_REVIEW_PRD', 'REF_URL', 'STATE1', 'ATPDURATIONTYPEKEY', 3, 'STDY_SUBJ_AREA', 'ACCT-1', 'CR-1', 'RICHTEXT-1', 'FEE-1', 'luType.nl.course', 'RICHTEXT-2', 'IDENT-NL-2', 'INSTR-1', 'PUBL-1')

// NL - CluSet - Math 158,221 CLU Set
INSERT INTO KSLU_CLU_SET (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, EFF_DT, EXPIR_DT, NAME, RT_DESCR_ID, CRIT_SET) VALUES ('CLUSET-NL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'}, 0, {ts '2003-01-01 00:00:00.0'}, {ts '2004-01-01 00:00:00.0'}, 'Math 158,221 CLU Set', 'RICHTEXT-5', 0)

// NL - Clu <-> CluSet join
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-NL-1', 'CLU-NL-1')
INSERT INTO KSLU_CLU_SET_JN_CLU (CLU_SET_ID, CLU_ID) VALUES ('CLUSET-NL-1', 'CLU-NL-2')

// NL - Req Component
INSERT INTO KSLU_REQ_COM (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, DESCR, ST, EFF_DT, EXPIR_DT, REQ_COM_TYPE_ID) VALUES ('REQCOMP-NL-1', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'Required Component 1','ACTIVE',{ts '2001-01-01 00:00:00.0'},{ts '2002-01-01 00:00:00.0'},'kuali.reqCompType.courseList.nof')

// NL - KSLU REQ COM FIELD
INSERT INTO KSLU_REQ_COM_FIELD (ID, REQ_COM_FIELD_KEY, VALUE) VALUES ('FIELD-1', 'reqCompFieldType.requiredCount', '1')
INSERT INTO KSLU_REQ_COM_FIELD (ID, REQ_COM_FIELD_KEY, VALUE) VALUES ('FIELD-2', 'reqCompFieldType.operator', 'greater_than_or_equal_to')
INSERT INTO KSLU_REQ_COM_FIELD (ID, REQ_COM_FIELD_KEY, VALUE) VALUES ('FIELD-3', 'reqCompFieldType.cluSet', 'CLUSET-NL-1')

// NL - KSLU_REQ_COM_JN_REQ_COM_FIELD
INSERT INTO KSLU_REQ_COM_JN_REQ_COM_FIELD (REQ_COM_ID, REQ_COM_FIELD_ID) VALUES ('REQCOMP-NL-1', 'FIELD-1')
INSERT INTO KSLU_REQ_COM_JN_REQ_COM_FIELD (REQ_COM_ID, REQ_COM_FIELD_ID) VALUES ('REQCOMP-NL-1', 'FIELD-2')
INSERT INTO KSLU_REQ_COM_JN_REQ_COM_FIELD (REQ_COM_ID, REQ_COM_FIELD_ID) VALUES ('REQCOMP-NL-1', 'FIELD-3')

INSERT INTO KSLU_STMT (ID, CREATEID, CREATETIME, UPDATEID, UPDATETIME, VERSIONIND, NAME, DESCR, ST, OPERATOR, PARENT_LU_STMT_ID,LU_STMT_TYPE_ID) VALUES ('STMT-3', 'CREATEID', {ts '2000-01-01 00:00:00.0'}, 'UPDATEID', {ts '2001-01-01 00:00:00.0'},1,'STMT 3','Statement 3','ACTIVE','AND',null,'kuali.luStatementType.prereqAcademicReadiness')

// CLU <-> LU STMT
INSERT INTO KSLU_CLU_JN_LU_STMT (CLU_ID, LU_STMT_ID) VALUES ('CLU-NL-1','STMT-3')

// LU STMT <-> REQ COM
INSERT INTO KSLU_STMT_JN_REQ_COM (REQ_COM_ID, LU_STMT_ID) VALUES ('REQCOMP-NL-1','STMT-3')


