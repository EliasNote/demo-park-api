-- ESSAS SENHAS FORAM CRIPTOGRAFADAS NO SITE https://bcrypt-generator.com/,
-- PARA FAZER LOGIN BASTA DIGITAR A SENHA NORMAL E A SENHA CRIPTOGRAFADA NO BANCO DE DADOS SERÀ DISCRIPTOGRADA AUTOMATICAMENTE PARA A VALIDAÇÃO
insert into USUARIOS (id, username, password, role) values (100, 'ana@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (101, 'elias@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_ADMIN');
insert into USUARIOS (id, username, password, role) values (102, 'luana@email.com', '$2a$12$FogGb0bNzX1z1vrf5Fmb8exF.DFOLf8Y4LHwbja4GtOFuGugeghcK', 'ROLE_CLIENTE');