DECLARE temp NUMBER;
BEGIN
SELECT COUNT(*) INTO temp FROM user_tables WHERE
table_name =
'KS_DB_VERSION';
IF temp <= 0 THEN EXECUTE IMMEDIATE 'CREATE
   TABLE KS_DB_VERSION
   (
       VERSION VARCHAR2(255),
       MODULE_NAME VARCHAR2(255),
       UPGRADE_TIME TIMESTAMP(6) DEFAULT SYSDATE,
       BUILD_ID VARCHAR2(255),
       BUILD_TIMESTAMP VARCHAR2(255)
   )'; END IF;
END;
/

delete from KS_DB_VERSION where MODULE_NAME ='ks-lum-sql'
/
insert into KS_DB_VERSION (VERSION, MODULE_NAME, BUILD_ID, BUILD_TIMESTAMP) values ('1.1.1', 'ks-lum-sql', '','')
/