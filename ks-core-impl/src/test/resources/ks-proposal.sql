INSERT INTO KSCO_PROPOSAL_TYPE (ID, NAME, TYPE_DESC, EFF_DT, EXPIR_DT) VALUES ('proposalType.courseCorrection', 'Course Correction', 'A proposed minor change to a course which would not result in the creation of a new cluId.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'});
INSERT INTO KSCO_PROPOSAL_TYPE (ID, NAME, TYPE_DESC, EFF_DT, EXPIR_DT) VALUES ('proposalType.newCourse', 'New Course', 'A new Course proposal.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'});

INSERT INTO KSCO_PROPOSAL (PROPOSAL_ID, NAME, RATIONALE, DETAIL_DESC, EFF_DT, EXPIR_DT, TYPE, STATE, VERSIONIND) VALUES ('PROPOSAL-1', 'Change "De-Cal" to "Democracy at Cal"', 'Faculty senate officially recommended changing the titles rendering on the transcript from "De-Cal"', 'Change De-Cal to Democracy at Cal in the short name field of the official identifier.', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'}, 'proposalType.courseCorrection', 'active', 1);


INSERT INTO KSCO_PROPOSAL_REFTYPE (ID, NAME, REFERENCE_DESC, EFF_DT, EXPIR_DT) VALUES ('REFTYPE-1', 'Clu', 'Reference type for a Clu', {ts '2000-01-01 00:00:00.0'}, {ts '2000-12-31 00:00:00.0'});

INSERT INTO KSCO_PROPOSAL_REFERENCE (REFERENCE_ID, OBJECT_REFERENCE_ID, TYPE) VALUES ('OBJREF-1', '550e8400-e29b-41d4-a716-446655440033', 'REFTYPE-1')
INSERT INTO KSCO_PROPOSAL_REFERENCE (REFERENCE_ID, OBJECT_REFERENCE_ID, TYPE) VALUES ('OBJREF-2', '550e8400-a65e-11d1-a7ab-446655440034', 'REFTYPE-1')
INSERT INTO KSCO_PROPOSAL_REFERENCE (REFERENCE_ID, OBJECT_REFERENCE_ID, TYPE) VALUES ('OBJREF-3', '550e8400-e34b-21d2-a78s-446655440035', 'REFTYPE-1')
INSERT INTO KSCO_PROPOSAL_REFERENCE (REFERENCE_ID, OBJECT_REFERENCE_ID, TYPE) VALUES ('OBJREF-4', '550e8400-e90c-31d3-a423-446655440036', 'REFTYPE-1')

INSERT INTO KSCO_PROPOSAL_JN_REFERENCE (PROPOSAL_ID, REFERENCE_ID) VALUES ('PROPOSAL-1', 'OBJREF-1');
INSERT INTO KSCO_PROPOSAL_JN_REFERENCE (PROPOSAL_ID, REFERENCE_ID) VALUES ('PROPOSAL-1', 'OBJREF-2');
INSERT INTO KSCO_PROPOSAL_JN_REFERENCE (PROPOSAL_ID, REFERENCE_ID) VALUES ('PROPOSAL-1', 'OBJREF-3');
INSERT INTO KSCO_PROPOSAL_JN_REFERENCE (PROPOSAL_ID, REFERENCE_ID) VALUES ('PROPOSAL-1', 'OBJREF-4');

