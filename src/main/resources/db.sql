
CREATE DATABASE hojadevida;

CREATE TABLE USUARIO (
                         ID INT NOT NULL,
                         USERNAME VARCHAR(20),
                         PASSWORD VARCHAR(200),
                         FIRSTNAME VARCHAR(200),
                         LASTNAME VARCHAR(200),
                         EMAIL VARCHAR(200),
                         ACTIVATED INT
);

CREATE TABLE AUTORIDAD (
    NAME VARCHAR (30)
);

CREATE TABLE USUARIO_AUTORIDAD (
                                   USER_ID INT not null ,
                                   AUTHORITY_NAME VARCHAR(30));
