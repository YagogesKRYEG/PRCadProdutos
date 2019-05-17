create database produtodb;
use produtodb;
create table tbproduto(
id int auto_increment primary key,
nomedoproduto varchar (50) not null,
descricaodoproduto varchar (50) not null,
fabricante varchar (20)not null,
quantidade int not null,
preco decimal(10,2) not null 
); 
insert into tbproduto(nomedoproduto,descricaodoproduto,fabricante,quantidade,preco) values ('Teclado Razer V6','teclado mecanico de switch azul','Razor','150','300');
select*from tbproduto;