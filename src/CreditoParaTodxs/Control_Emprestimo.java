package CreditoParaTodxs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import conexao.ConexaoUtil;

public class Control_Emprestimo {

	public static void inserir(Emprestimo credito) {
		try {
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql  = "insert into Emprestimo(id,faixaEmprestimo1,faixaEmprestimo2,faixaEmprestimo3)values (?,?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
	
		statement.setInt(1, credito.getId());
		statement.setDouble(2, credito.getFaixaEmprestimo1());
		statement.setDouble(3, credito.getFaixaEmprestimo2());
		statement.setDouble(4, credito.getFaixaEmprestimo3());
		
		
		
		statement.execute();
		connection.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static  void remover( int id) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "delete from Emprestimo where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1,id);
			
			statement.execute();
			statement.close();
		}catch (Exception e) {
		}
	}
	  public static  List<Emprestimo> listarTodos(){
		
		List<Emprestimo> listarEmprestimo = new ArrayList<Emprestimo>();
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			String sql = "select * from Emprestimo";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()) {
				
			Emprestimo credito = new Emprestimo();
			credito.setId(1);
			credito.setFaixaEmprestimo1(resultset.getFloat(3000));
			credito.setFaixaEmprestimo2(resultset.getFloat(5000));
			credito.setFaixaEmprestimo3(resultset.getFloat(8000));
			
			listarEmprestimo.add(credito);
			
		}
		connection.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
		return listarEmprestimo;
	  }
	  public static void atualizar (Emprestimo credito) {
		  
		  try {
			  
			  Connection connection = ConexaoUtil.getInstance().getConnection();
			  String sql = "update Emprestimo set faixaEmprestimo1 = ? where faixaEmprestimo1 =?";
			  PreparedStatement statement = connection.prepareStatement(sql);
			  
			  statement.setInt(1,credito.getId());
			  statement.setDouble(1,credito.getFaixaEmprestimo1());
			  statement.setDouble(2,credito.getFaixaEmprestimo2());
			  statement.setDouble(3,credito.getFaixaEmprestimo3());

			    statement.execute();
				statement.close();		
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  
	  }
	  public static void main(String[]args) {
		  
		  Emprestimo credito = new Emprestimo();
		  credito.setId(1);
		  credito.setFaixaEmprestimo1(3000);
		  credito.setFaixaEmprestimo2(5000);
		  credito.setFaixaEmprestimo3(8000);
		  
		  inserir(credito);
		  
	  }
	
}
