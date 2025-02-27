package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_enderecoCliente")
public class EnderecoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_enderecoCliente")
	private long id_enderecoCliente;
	
	@Column(name = "cep", nullable =false, length = 8, unique = true)
	private String cep;
	
	@Column(name = "cidade", nullable = false, length = 100)
	private String cidade;
	
	@Column(name = "estado", nullable = false, length = 100)
	private String estado;
	
	@Column(name = "rua", nullable = false, length = 100)
	private String rua;
	
	@Column(name = "numcasa", nullable = false, length = 10)
	private String numcasa; 
	
	@Column(name = "complemento", nullable = false, length = 100)
	private String complemento;

	public EnderecoCliente(long id_enderecoCliente, String cep, String cidade, String estado, String rua,
			String numcasa, String complemento) {
		super();
		this.id_enderecoCliente = id_enderecoCliente;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.rua = rua;
		this.numcasa = numcasa;
		this.complemento = complemento;
	}

	public long getId_enderecoCliente() {
		return id_enderecoCliente;
	}

	public void setId_enderecoCliente(long id_enderecoCliente) {
		this.id_enderecoCliente = id_enderecoCliente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumcasa() {
		return numcasa;
	}

	public void setNumcasa(String numcasa) {
		this.numcasa = numcasa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	
}
