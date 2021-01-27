package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import entidade.Contato;
import util.JpaUtil;

public class ClienteDaoImp implements ClienteDao {

	@Override
	public boolean CadastrarCliente(Cliente cliente) {
		 EntityManager emt = JpaUtil.getEntityManager();
		 EntityTransaction tx = emt.getTransaction();
		 
		 	tx.begin();
			
			emt.merge(cliente);

			tx.commit();
			emt.close();
		return true;
	}
	
	

	@Override
	public List<Cliente> PesquisarCliente(Cliente cliente) {

		
		return null;
	}



	@Override
	public boolean CadastrarContato(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean ExcluirContato(Cliente cliente) {
		EntityManager emt = JpaUtil.getEntityManager();
		EntityTransaction tx = emt.getTransaction();
		Contato contato = new Contato();
		
		Contato existe = emt.find(Contato.class, contato.getIdcontato());
		
		tx.begin();
		
		if(existe != null) {
			emt.remove(existe);
			tx.commit();
			emt.close();
			return true;
		}else {
			return false;
		}
		
	}
	

	@Override
	public Cliente pesquisaCliente(String cpf) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();

		Cliente cliente = null;

		tx.begin();

		Cliente existe = ent.find(Cliente.class, cpf);

		if (existe != null) {
			cliente = existe;
		}

		return cliente;
	}

}
