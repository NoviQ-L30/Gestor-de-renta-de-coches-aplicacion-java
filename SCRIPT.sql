create database Venta_Coches;
use Venta_Coches;

create table Autos(
Auto varchar(50),
Vin varchar(50) not null primary key,
Modelo varchar(50),
Marca varchar(50),
Color varchar(50),
Tipo_Auto varchar(50)
);

select * from autos;

create table Renta3(
Id_Rastreo varchar(50) not null primary key,
Fecha_Ini_Renta varchar(50),
Fecha_Ter_Renta varchar(50),
Costo varchar(50),
Metodo_Pago varchar(50),
Costos_Extra varchar(50)
);

describe Renta;

select * from Renta3;

select * from Autos;

insert into Autos(Auto,Vin,Modelo,Marca,Color,Tipo_Auto)values('Vocho','2HG564KJ231DF45','2004','Volksvwagen','Blanco','Compacto');
insert into Autos(Auto,Vin,Modelo,Marca,Color,Tipo_Auto)values('I30 CW','3DG5G6KJ239LF75','2020','Hyundai','Rojo','Familiar');
insert into Autos(Auto,Vin,Modelo,Marca,Color,Tipo_Auto)values('Supra','1NMEJ221FG49','2019','Toyota','Azul','Deportivo');
describe Autos;

insert into Renta3(Id_Rastreo,Fecha_Ini_Renta,Fecha_Ter_Renta,Costo,Metodo_Pago,Costos_Extra)values('18972','2022/12/10','2022/12/15','800','Efectivo','200');
insert into Renta3(Id_Rastreo,Fecha_Ini_Renta,Fecha_Ter_Renta,Costo,Metodo_Pago,Costos_Extra)values('12342','2022/11/06','2022/11/25','1500','Tarjeta','500');
insert into Renta3(Id_Rastreo,Fecha_Ini_Renta,Fecha_Ter_Renta,Costo,Metodo_Pago,Costos_Extra)values('01924','2022/10/23','2022/11/01','10000','Efectivo','5000');

select * from usuarios;

create table Usuarios(
Nombres varchar(50) ,
Apellidos varchar(50),
Email varchar(50),
Username varchar(50) not null primary key,
Contraseña varchar(50)
);



select * from Usuarios;

insert into Usuarios(Nombres,Apellidos,Email,Username,Contraseña)values
('Michelle Niña','Monte negro','Michi@gmail.com','Michi32','Michi123');
insert into Usuarios(Nombres,Apellidos,Email,Username,Contraseña)values
('Marco Antonio','Puentes Nilan','Miltan@gmail.com','MarcoS96','Marco123');
insert into Usuarios(Nombres,Apellidos,Email,Username,Contraseña)values
('Paty Perla','Martinez de luna','Patybb@gmail.com','Paty45','Paty123');


