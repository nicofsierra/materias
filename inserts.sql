create database materias;
insert into materia (anio,codigo,nombre,cargaHoraria,aprobada,fechaAprobacion) VALUES (1,1023,'Análisis Matemático I',8,true,'2008-11-27'),
(1,1024,'Elementos de Programación',8,true,'2008-11-27'),
(1,1025,'Sistemas de Representación',4,true,'2012-07-21'),
(1,1026,'Tecnología, Ingeniería y Sociedad',4,true,'2008-11-27'),
(1,1027,'Álgebra y Geometría Analítica I',8,true,'2008-11-27'),
(1,1028,'Matemática Discreta',4,true,'2019-07-20'),
(1,1029,'Química General',4,true,'2019-07-20'),
(1,1030,'Fundamentos de TICs',8,true,'2008-11-27'),
(2,1031,'Física I',8,true,'2008-11-27'),
(2,1032,'Álgebra y Geometría analítica II',4,false,'0000-00-00'),
(2,1033,'Análisis Matemático II',8,true,'2008-11-27'),
(2,1035,'Física II',8,false,'0000-00-00'),	
(2,1108,'Requerimientos para la Ingeniería',4,true,'2008-11-27'),
(2,1109,'Arquitectura de Computadoras',6,false,'0000-00-00'),
(2,1110,'Programación / Incluye TCP',10,true,'2008-11-27'),
(3,1111,'Probabilidad y Estadística',4,false,'0000-00-00'),	
(3,1112,'Auditoría y Seguridad Informática ',4,true,'2008-11-27'),
(3,1113,'Programación Avanzada / Incluye TCP ',10,false,'0000-00-00'),	
(3,1114,'Base de Datos',6,false,'0000-00-00'),	
(3,1115,'Sistemas Operativos ',8,false,'0000-00-00'),
(3,1116,'Análisis de Sistemas / Incluye TCP',10,true,'2008-11-27'),
(3,1117,'Cálculo Numérico ',4,false,'0000-00-00'),
(4,1118,'Ingeniería de Requerimientos ',4,true,'2012-12-08'),
(4,1119,'Comunicación de Datos ',4,false,'0000-00-00'),
(4,1120,'Diseño de Sistemas / Incluye TCP ',10,false,'0000-00-00'),	
(4,1121,'Análisis de Software ',4,false,'0000-00-00'),
(4,1122,'Redes de Computadoras ',8,false,'0000-00-00'),
(4,1123,'Sistemas Operativos Avanzados ',4,false,'0000-00-00'),	
(4,1124,'Lenguajes y Compiladores ',4,false,'0000-00-00'),
(4,1125,'Gestión Organizacional ',8,false,'0000-00-00'),
(5,1126,'Ingeniería de Software / Incluye TCP',10,false,'0000-00-00'),	
(5,1127,'Elementos de Inteligencia Artificial ',4,false,'0000-00-00'),
(5,1128,'Electiva I',4,false,'0000-00-00'),
(5,1129,'Autómatas y Lenguajes Formales ',6,false,'0000-00-00'),	
(5,1130,'Electiva II',4,false,'0000-00-00'),
(5,1131,'Electiva III',4,false,'0000-00-00'),
(5,1132,'Proyecto de fin de carrera',4,false,'0000-00-00'),	
(5,1133,'Práctica Profesional Supervisada',12,false,'0000-00-00'),	
(0,901,'Inglés Transversal Nivel I',4,true,'0000-00-00'),
(0,902,'Inglés Transversal Nivel II',4,true,'0000-00-00'),
(0,903,'Inglés Transversal Nivel III',4,true,'0000-00-00'),
(0,904,'Inglés Transversal Nivel IV',4,false,'0000-00-00'),
(0,911,'Computación Transversal Nivel I',4,true,'0000-00-00'),
(0,912,'Computación Transversal Nivel II',4,true,'0000-00-00');

insert into correlativa (codigo,idCorrelativa) VALUES (1023,null),
(1024,null),
(1025,null),
(1026,null),
(1027,null),
(1028,null),
(1029,null),
(1030,null),
(1031,1023),
(1032,1027),
(1033,1023),
(1035,1031),
(1108,1030),
(1109,1028),(1109,1030),
(1110,1024),(1110,1028),
(1111,1033),
(1112,1026),(1112,1109),
(1113,1023),(1113,1110),
(1114,1028),(1114,1033),
(1115,1109),(1115,1110),
(1116,1028),(1116,1108),
(1117,1032),(1117,1033),
(1118,1116),
(1119,1109),(1119,1115),
(1120,1116),
(1121,1113),
(1122,1031),(1122,1119),
(1123,1113),(1123,1115),
(1124,1110),(1124,1115),
(1125,1026),(1125,1116),
(1126,1025),(1126,1029),(1126,1035),(1126,1109),(1126,1111),(1126,1115),(1126,1117),(1126,1120),
(1127,1029),(1127,1032),(1127,1035),
(1128,1025),(1128,1029),(1128,1035),(1128,1111),(1128,1115),(1128,1117),(1128,1122),
(1129,1025),(1129,1029),(1129,1035),(1129,1111),(1129,1117),(1129,1122),
(1130,1025),(1130,1029),(1130,1035),(1130,1111),(1130,1115),(1130,1117),(1130,1122),
(1131,1025),(1131,1029),(1131,1035),(1131,1111),(1131,1115),(1131,1117),(1131,1122),
(1132,1023),(1132,1024),(1132,1025),(1132,1026),(1132,1027),(1132,1028),(1132,1029),(1132,1030),(1132,1031),(1132,1032),(1132,1033),(1132,1035),
(1132,1108),(1132,1109),(1132,1110),(1132,1111),(1132,1112),(1132,1113),(1132,1114),(1132,1115),(1132,1116),(1132,1117),(1132,1118),(1132,1119),(1132,1120),(1132,1121),
(1132,1122),(1132,1123),(1132,1124),(1132,1125),
(1133,1118),(1133,1119),(1133,1120),(1133,1121),(1133,1125),
(901,null),
(902,901),
(903,902),
(904,903),
(911,null),
(912,911);
