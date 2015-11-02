package br.univel.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.univel.cadastros.Cliente;

public class ClienteDaoImplements{
	private static Connection con;
	
	private Connection getConnection() {
		
		synchronized (con) {
			if (con == null) {
				// TODO
			}
			return con;
		}
	}
	
	public void inserir(Cliente c) {
	
	}

	public void atualizar(Cliente c) {
		
	}

	public void excluir(Cliente c) {
		
	}

	public Cliente buscar(int id) {
		
		return null;
	}


	public List<Cliente> listar() {
		
		return null;
	}
}