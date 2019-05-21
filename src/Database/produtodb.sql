create database clientedb;
use clientedb;

create table tb_produto(
id int auto_increment primary key,
nomeproduto varchar(50) not null,
descricao text not null,
quantidade int not null default 1,
fabricante varchar(50) not null,
preco decimal (10,2) not null
);
insert into tb_produto(nomeproduto,descricao,fabricante,quantidade,preco) values ('Teclado Razer V6','teclado mecanico de switch azul','Razor','150','300');
select*from tb_produto;