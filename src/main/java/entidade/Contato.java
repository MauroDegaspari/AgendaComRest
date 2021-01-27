package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="tCONTATO")
public class Contato {
	
	@Id
	@Column(name="ID_CONTATO", nullable=true)
	@GeneratedValue(generator = "S_CONTATO")
	@SequenceGenerator(name="S_CONTATO", sequenceName = "S_CONTATO", allocationSize = 1)
	private int id_contato;
		
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@Column(name="TELEFONE", nullable=false)
	private int telefone;
	
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdcontato() {
		return id_contato;
	}
	public void setIdcontato(int idcontato) {
		this.id_contato = idcontato;
	}
}
