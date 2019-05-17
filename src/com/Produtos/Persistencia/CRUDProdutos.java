package com.Produtos.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.PRCadProdutos.dominio.Produtos;
import com.prjcadcliente.dominio.Cliente;
/**
 * <b> CRUDProdutos</b><br>
 * Essa classe permite manipular as informações do Produto. Aqui você encontrara os seguintes comandos
 * @author Yago Aparecido dos Santos Silva
 *<ul>
 *<li>Cadastro</li>
 *<li>Pesquisar por nome e por id</li>
 *<li>Atualizar</li>
 *<li>declarar</li>
 */
public class CRUDProdutos {
	private Connection con =null;//Estabelecer a comunicação com o banco de dados
	private ResultSet rs =null;//Guardar os returnos dos selects no banco de dados
	private PreparedStatement pst =null;//Executa as consultas de SQL
	public String cadastrar(Produtos produto) {
		 String msg;
		//Criação dos objetos para a conexão com o banco os dados
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientedb?serverTimezone=UTC","root","");
		 String Consulta = "INSERT INTO tbproduto(Nomedoproduto,Descriçãodoproduto,Fabricante do produto,Quantidade,Preco)values(?,?,?,?,?)";
		 pst = con.prepareStatement(Consulta);
		 pst.setString(1, produto.getNome());
		 pst.setString(2, produto.getDescricao());
		 pst.setString(3, produto.getFabricante());
		 pst.setInt(4, produto.getQuantidade());
		 pst.setDouble(5, produto.getPreco());
		 int r = pst.executeUpdate();
		 if(r > 0)
			 msg = "Cadastro Realizado com sucesso!!!";
		 else
			 msg="Não foi possivel cadastrar!!!";
	}
		catch(SQLException ex) {
			msg ="Erro ao tentar cadastrar"+ex.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado:"+e.getMessage();
		}
		finally {
			try{con.close();}catch(Exception e) {e.printStackTrace();}
		} 
		return msg;
	}
	public String atualizar(Produtos produto) {
		String msg;
		//Criação dos objetos para a conexão com o banco os dados
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientedb?serverTimezone=UTC","root","");
		 String Consulta = "UPDATE tbproduto SET Nomedoproduto=?, Descriçãodoproduto=?, Fabricante do produto ,Quantidade=? ,Preco=?)values(?,?,?,?,?)";
		 pst = con.prepareStatement(Consulta);
		 pst.setString(1, produto.getNome());
		 pst.setString(2, produto.getDescricao());
		 pst.setString(3, produto.getFabricante());
		 pst.setInt(4, produto.getQuantidade());
		 pst.setDouble(5, produto.getPreco());
		 int r = pst.executeUpdate();
		 if(r > 0)
			 msg = "Atualizado com sucesso";
		 else
			 msg="Não foi possivel Atualizar!!!";
	}
		catch(SQLException ex) {
			msg ="Erro ao tentar Atualizar"+ex.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado:"+e.getMessage();
		}
		finally {
			try{con.close();}catch(Exception e) {e.printStackTrace();}
		} 
		return msg;
	}
public String deletar(Produtos produtos) {
		
		String msg;
		//Criação dos objetos para a conexão com o banco os dados
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientedb?serverTimezone=UTC","root","");
		 String Consulta = "DELETE FROM tbproduto WHERE id=?";
		 pst = con.prepareStatement(Consulta);
		 pst.setString(1, produtos.getNome());
		 int r = pst.executeUpdate();
		 if(r > 0)
			 msg = "Deletado com sucesso!!!";
		 else
			 msg="Não foi possivel Deletar!!!";
	}
		catch(SQLException ex) {
			msg ="Erro ao tentar Deletar"+ex.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado:"+e.getMessage();
		}
		finally {
			try{con.close();}catch(Exception e) {e.printStackTrace();}
		} 
		return msg;
		
	}
}
