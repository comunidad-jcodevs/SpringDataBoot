Create database escueladb;

use escueladb;


CREATE TABLE alumno (
       idAlumno       integer NOT NULL AUTO_INCREMENT,
       nombres        varchar(50) NULL,
       apellidos      varchar(50) NULL,
       estado         integer NULL,
	   Primary Key (idAlumno)
);



insert alumno values(1,'Edwin','Maraví',1);


CREATE TABLE curso(
       idCurso        integer NOT NULL AUTO_INCREMENT,
       nombre         varchar(50) NULL,
       descripcion    varchar(50) NULL,
	   estado 	      integer,
	   Primary Key (idCurso)
);


insert curso values(1,'Java','Java Programmer 8',1);

CREATE TABLE alumnocurso (
       idAlumnoCurso  integer NOT NULL AUTO_INCREMENT,
	   idAlumno       integer NOT NULL,
	   idCurso        integer NOT NULL,
       fechaInicio    Date,
       fechaFin       Date,
       estado         integer,
	   Primary Key (idAlumnoCurso)
);

Alter table alumnocurso add Foreign Key (idAlumno) references alumno (idAlumno) on delete  restrict on update  restrict;
Alter table alumnocurso add Foreign Key (idAlumno) references curso (idCurso) on delete  restrict on update  restrict;