--tabla de usuarios
create table usuarios (
    usuario_id varchar(4) primary key,
    nombre varchar(100) not null,
    correo_electronico varchar(100) unique not null
);

-- tabla de buses
create table buses (
    bus_id varchar(4) primary key,
    numero_bus integer not null unique,
    capacidad_maxima integer not null check (capacidad_maxima > 0)
);

-- tabla de rutas
create table rutas (
    ruta_id varchar(4) primary key,
    origen varchar(50) not null,
    destino varchar(50) not null,
    hora_salida time not null,
    hora_llegada time not null,
    check (hora_llegada > hora_salida)
);

-- tabla de reservas
create table reservas (
    reserva_id varchar(4) primary key,
    usuario_id varchar(4) not null,
    ruta_id varchar(4) not null,
    bus_id varchar(4) not null,
    foreign key (usuario_id) references usuarios(usuario_id),
    foreign key (ruta_id) references rutas(ruta_id),
    foreign key (bus_id) references buses(bus_id)
);

-- datos de usuarios
insert into usuarios (usuario_id, nombre, correo_electronico) values
    ('u001', 'david llerena', 'david@a.com'),
    ('u002', 'jose perala', 'jose@a.com'),
    ('u003', 'keyla freire', 'keyla@a.com'),
    ('u004', 'roberto siza', 'roberto@a.com'),
    ('u005', 'ingrid saltos', 'ingrid@a.com');

-- datos de buses
insert into buses (bus_id, numero_bus, capacidad_maxima) values
    ('b001', 105, 20),
    ('b002', 106, 17),
    ('b003', 107, 18),
    ('b004', 108, 20),
    ('b005', 109, 25);

-- datos de rutas
insert into rutas (ruta_id, origen, destino, hora_salida, hora_llegada) values
    ('r001', 'guayaquil', 'manta', '08:00', '12:00'),
    ('r002', 'guayaquil', 'quito', '09:00', '17:00'),
    ('r003', 'quito', 'esmeraldas', '10:00', '12:00'),
    ('r004', 'quito', 'sto. domingo', '11:00', '13:00'),
    ('r005', 'quito', 'manabi', '12:00', '19:00');

-- datos de reservas
insert into reservas (reserva_id, usuario_id, ruta_id, bus_id) values
    ('re01', 'u001', 'r001', 'b001'),
    ('re02', 'u002', 'r002', 'b002'),
    ('re03', 'u003', 'r003', 'b003'),
    ('re04', 'u004', 'r004', 'b004'),
    ('re05', 'u005', 'r005', 'b005');

select * from usuarios
select * from buses
select * from rutas
select * from reservas

select origen,destino,hora_salida,hora_llegada  from rutas