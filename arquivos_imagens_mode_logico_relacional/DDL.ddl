-- Gerado por Oracle SQL Developer Data Modeler 21.4.2.059.0838
--   em:        2023-03-06 22:24:00 BRT
--   site:      Oracle Database 21c
--   tipo:      Oracle Database 21c



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE tbl_desenvolvimento (
    nm_desenvolvedor   VARCHAR2(50),
    id_dev             INTEGER,
    dt_desenvolvimento TIMESTAMP,
    desenvolvimento_id NUMBER NOT NULL,
    id_desenvolvimento INTEGER
);

ALTER TABLE tbl_desenvolvimento ADD CONSTRAINT desenvolvimento_pk PRIMARY KEY ( desenvolvimento_id );

CREATE TABLE tbl_financiero (
    vl_custo          FLOAT,
    dt_custos         TIMESTAMP,
    vl_folhapagamento FLOAT,
    dt_folhapagamento TIMESTAMP,
    vl_lucro          FLOAT,
    financiero_id     NUMBER NOT NULL,
    id_financeiro     INTEGER
);

ALTER TABLE tbl_financiero ADD CONSTRAINT financiero_pk PRIMARY KEY ( financiero_id );

CREATE TABLE tbl_jogo (
    id_jogo                      INTEGER,
    nm_jogo                      VARCHAR2(50 CHAR),
    dt_criacao                   DATE,
    jogo_id                      NUMBER NOT NULL,
    tbl_financiero_financiero_id NUMBER NOT NULL
);

ALTER TABLE tbl_jogo ADD CONSTRAINT jogo_pk PRIMARY KEY ( jogo_id );

CREATE TABLE tbl_ling_programacao (
    ling_java                              VARCHAR2(4000),
    ling_py                                VARCHAR2(4000),
    ling_c#                                VARCHAR2(4000),
    "ling_C++"                             VARCHAR2(4000),
    programacao_id                         NUMBER NOT NULL,
    tbl_jogo_jogo_id                       NUMBER NOT NULL, 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    tbl_desenvolvimento_desenvolvimento_id NUMBER NOT NULL,
    id_programacao                         INTEGER
);

ALTER TABLE tbl_ling_programacao ADD CONSTRAINT programacao_pk PRIMARY KEY ( programacao_id );

ALTER TABLE tbl_jogo
    ADD CONSTRAINT tbl_jogo_tbl_financiero_fk FOREIGN KEY ( tbl_financiero_financiero_id )
        REFERENCES tbl_financiero ( financiero_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE tbl_ling_programacao
    ADD CONSTRAINT tbl_ling_programacao_tbl_jogo_fk FOREIGN KEY ( tbl_jogo_jogo_id )
        REFERENCES tbl_jogo ( jogo_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE tbl_ling_programacao
    ADD CONSTRAINT tbl_programacao_tbl_desenvolvimento_fk FOREIGN KEY ( tbl_desenvolvimento_desenvolvimento_id )
        REFERENCES tbl_desenvolvimento ( desenvolvimento_id );

CREATE SEQUENCE desenvolvimento_desenvolviment 
START WITH 1 
    NOCACHE 
    ORDER ;

CREATE OR REPLACE TRIGGER desenvolvimento_desenvolviment 
BEFORE INSERT ON tbl_desenvolvimento 
FOR EACH ROW 
WHEN (NEW.desenvolvimento_ID IS NULL) 
BEGIN
:new.desenvolvimento_id := desenvolvimento_desenvolviment.nextval;

end;
/

CREATE SEQUENCE financiero_financiero_ID_SEQ 
START WITH 1 
    NOCACHE 
    ORDER ;

CREATE OR REPLACE TRIGGER financiero_financiero_ID_TRG 
BEFORE INSERT ON tbl_financiero 
FOR EACH ROW 
WHEN (NEW.financiero_ID IS NULL) 
BEGIN
:new.financiero_id := financiero_financiero_id_seq.nextval;

end;
/

CREATE SEQUENCE jogo_jogo_ID_SEQ 
START WITH 1 
    NOCACHE 
    ORDER ;

CREATE OR REPLACE TRIGGER jogo_jogo_ID_TRG 
BEFORE INSERT ON tbl_jogo 
FOR EACH ROW 
WHEN (NEW.jogo_ID IS NULL) 
BEGIN
:new.jogo_id := jogo_jogo_id_seq.nextval;

end;
/

CREATE SEQUENCE programacao_programacao_ID_SEQ 
START WITH 1 
    NOCACHE 
    ORDER ;

CREATE OR REPLACE TRIGGER programacao_programacao_ID_TRG 
BEFORE INSERT ON tbl_ling_programacao 
FOR EACH ROW 
WHEN (NEW.programacao_ID IS NULL) 
BEGIN
:new.programacao_id := programacao_programacao_id_seq.nextval;

end;
/



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             4
-- CREATE INDEX                             0
-- ALTER TABLE                              7
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           4
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          4
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   3
-- WARNINGS                                 0
