Create database agenda;
use agenda;
Create table CONTACTOS ( 
   ID int primary key, 
   NOMBRE varchar(30), 
   CIUDAD varchar(30) ); 

insert into CONTACTOS values(1, 'PABLO', 'ALMERIA');
insert into CONTACTOS values(2, 'MARIO', 'GRANADA');
insert into CONTACTOS values(3, 'LUCIA', 'MADRID');

create table CORREOS ( 
   ID int primary key,
   ID_CONTACTO varchar(30),
   CORREO varchar(100) );

insert into CORREOS values(1, 1, 'pablo@yahoo.com');
insert into CORREOS values(2, 1, 'pablo@gmail.com');
insert into CORREOS values(3, 2, 'mario@yahoo.com'); 
insert into CORREOS values(4, 2, 'mario@empresa.com');
insert into CORREOS values(5, 2, 'mario@jaspersoft.com');
insert into CORREOS values(6, 3, 'lmc@dominio.es');
insert into CORREOS values(7, 3, 'lucy@algunemail.com');
insert into CORREOS values(8, 3, 'luciamartos@organizacion.org');


create table TELEFONOS (
   ID int primary key,
   ID_CONTACTO varchar(30),
   TELEFONO varchar(100) );

insert into TELEFONOS values(1, 1, '111111111');
insert into TELEFONOS values(2, 1, '222222222');
insert into TELEFONOS values(3, 1, '333333333');
insert into TELEFONOS values(4, 2, '444444444');
insert into TELEFONOS values(5, 3, '555555555');
insert into TELEFONOS values(6, 3, '666666666');