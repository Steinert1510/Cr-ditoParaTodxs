package CreditoParaTodxs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import conexao.ConexaoUtil;


public class Control_Cliente {

	public static void inserir(Cliente cliente) {
		try {
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql  = "insert into Cliente(id,cpf,nome)values (?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
	
		statement.setInt(1, cliente.getId());
		statement.setString(2, cliente.getCpf());
		statement.setString(3, cliente.getNome());
		
		
		
		statement.execute();
		connection.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static  void remover( int id) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "delete from Cliente where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1,id);
			
			statement.execute();
			statement.close();
		}catch (Exception e) {
		}
	}
	  public static  List<Cliente> listarTodos(){
		
		List<Cliente> listarCliente = new ArrayList<Cliente>();
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "select * from Cliente";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()) {
				
			Cliente cliente = new Cliente();
			cliente.setId(resultset.getInt(1));
			cliente.setCpf(resultset.getString(""));
			cliente.setNome(resultset.getString("nome"));
			
			
			listarCliente.add(cliente);
			
		}
		connection.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
		return listarCliente;
	  }
	  public static void atualizar (Cliente cliente) {
		  
		  try {
			  
			  Connection connection = ConexaoUtil.getInstance().getConnection();
			  String sql = "update cliente set nome = ? where nome =?";
			  PreparedStatement statement = connection.prepareStatement(sql);
			  
			  statement.setInt(1,cliente.getId());
			  statement.setString(2,cliente.getCpf());
			  statement.setString(3,cliente.getNome());
			  

			    statement.execute();
				statement.close();		
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  
	  }
	  public static void main(String[]args) {
		  
		  Cliente cliente = new Cliente();
		  cliente.setId(1);
		  cliente.setCpf("001.002.003-12");
		  cliente.setNome("Holf ");
		  
		  
		  inserir(cliente);
		  
	  }
	
}
