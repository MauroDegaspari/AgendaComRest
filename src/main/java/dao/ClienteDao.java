package dao;

import java.util.List;

import entidade.Cliente;

public interface ClienteDao {

	public boolean CadastrarCliente(Cliente cliente);
	
	public Cliente pesquisaCliente(String cpf);
	
	public List<Cliente> PesquisarCliente(Cliente cliente);
	
	public boolean CadastrarContato(Cliente cliente);

	public boolean ExcluirContato(Cliente cliente);
	
}
