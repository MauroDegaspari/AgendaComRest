import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import entidade.Contato;
import util.JpaUtil;

public class EnvioDados {

	public static void main(String[] args) {
		EntityManager emt = JpaUtil.getEntityManager();
		
		Cliente cliente = new Cliente();
		Contato contato = new Contato();
		
		cliente.setNome("teste");
		cliente.setIdade(21);
		cliente.setCpf("123456789");
		cliente.setSexo("qualwurert");
		cliente.setInteresses("lkjsdfç");
		contato.setEmail("mauro@mauro");
		contato.setTelefone(321654674);
		
		cliente.setContato(contato);
				
				EntityTransaction tx = emt.getTransaction();
		tx.begin();

		emt.merge(cliente);
		tx.commit();
		emt.close();
		

	}

}
