package br.univel.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import br.univel.enums.Estado;
import br.univel.cadastros.Cliente;

public class ClienteD {

	Connection con;

//inserção do cadastro de cliente feito no bd
	public void inserir(Cliente c) throws SQLException {

		con = Conexao.getConnection();

		String sql = "INSERT INTO CLIENTE (ID, NOME,ENDERECO, CIDADE, ESTADO, EMAIL) VALUES (?,?,?,?,?,?)";

		try {
			PreparedStatement stmt;
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, c.getId());
			stmt.setString(2, c.getNome());
			stmt.setString(3, c.getEndereco());
			stmt.setString(4, c.getCidade());
			stmt.setString(5, c.getEstado().toString());
			stmt.setString(6, c.getEmail());

			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null,
					"Cliente cadastrado com sucesso!!!");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"ERRO: Problemas ao salvar cliente!!!");
			e.printStackTrace();
		}

	}
	//listar cadastro do cliente
	public List<Cliente> listarCLiente(List<Cliente> lista) throws SQLException {

		String sql = "Select nome from Cliente";

		con = Conexao.getConnection();

		PreparedStatement stmt = con.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			Cliente c = new Cliente(1, "nome", "end", "city", "estado",null, "r.odxd@hotmail.com", null);

			c.setNome(rs.getString("nome"));

			lista.add(c);
		}

		return lista;
	}

	
	//altera cadastro no bd
	public void alterar(int id, String nome, String endereco, String cidade,
			Estado estado, String email) throws SQLException {
		con = Conexao.getConnection();

		String sql = "UPDATE CLIENTE SET NOME = ?, ENDERECO = ?,"
				+ "CIDADE = ?, ESTADO = ?, EMAIL = ? WHERE ID = ?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(6, id);
			stmt.setString(1, nome);
			stmt.setString(2, endereco);
			stmt.setString(3, cidade);
			stmt.setString(4, estado.toString());
			stmt.setString(5, email);

			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null,
					"Cliente editado com sucesso !!!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel alterar cadastro do cliente !");
			e.printStackTrace();
		}
	}
	
	//deleta 
	public Cliente deletar(int id) throws SQLException {

		con = Conexao.getConnection();

		try {
			PreparedStatement stmt;
			stmt = con.prepareStatement("DELETE FROM CLIENTE WHERE ID = ?");
			int rs = stmt.executeUpdate();
			stmt.setInt(1, id);
			JOptionPane.showMessageDialog(null,
					"Cliente apagado com sucesso!!!");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Não foi possivel apagar cliente");
			e.printStackTrace();
		}

		return null;

	}

}