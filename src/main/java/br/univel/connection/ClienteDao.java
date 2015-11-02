package br.univel.connection;

import java.util.List;
import br.univel.trab.Cliente;

public interface ClienteDao {

		public void inserir(Cliente c);

		public void atualizar(Cliente c);

		public void excluir(Cliente c);

		public Cliente buscar(int id);

		public List<Cliente> listar();

		
}
