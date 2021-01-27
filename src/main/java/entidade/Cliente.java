package entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tCLIENTE")
public class Cliente {
	
	@Id
	@Column(name="ID_CLIENTE", nullable= true)
	@GeneratedValue(generator = "S_CLIENTE")
	@SequenceGenerator(name="S_CLIENTE", sequenceName = "S_CLIENTE", allocationSize = 1)
	private int idcliente;
	
	@Column( name="CPF", nullable = false)
	private String cpf;
	
	@Column( name="NOME", nullable = false)
	private String nome;
	
	@Column(name="IDADE", nullable = true)
	private int idade;
	
	
	@Column(name="SEXO", nullable = true)
	private String sexo;
	
	@Column(name="INTERESSES", nullable = true)
	private String interesses;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
	private Contato contato;
	
	
	// Getteres & Setteres

	
	public String getInteresses() {
		return interesses;
	}
	public void setInteresses(String interesse) {
		this.interesses = interesse;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
