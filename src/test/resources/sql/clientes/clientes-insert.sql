insert into USUARIOS (id, username, password, role) values (100, 'ana@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (101, 'elias@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_ADMIN');
insert into USUARIOS (id, username, password, role) values (102, 'luana@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (103, 'toby@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_CLIENTE');

insert into CLIENTES(id, nome, cpf, id_usuario) values (10, 'Luana Silva', '95240496005', 102);
insert into CLIENTES(id, nome, cpf, id_usuario) values (20, 'Ana Brasil', '47854723087', 100);