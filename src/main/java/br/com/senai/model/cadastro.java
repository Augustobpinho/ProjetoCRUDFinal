package br.com.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Nome deve conter entre 5 e 254 caracteres")
	private String nome;
	
	@Min(0)
	private String sexo;
	
	@Min(0)
	private int datanasc;
	
	@Min(0)
	private int cpf;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Endereço deve conter entre 5 e 254 caracteres")
	private String endereco;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Bairro deve conter entre 5 e 254 caracteres")
	private String bairro;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Cidade deve conter entre 5 e 254 caracteres")
	private String cidade;
	
	@Min(0)
	private int cep;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="UF deve conter entre 5 e 254 caracteres")
	private String uf;
	
	@Min(0)
	private int telefone;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="E-mail deve conter entre 5 e 254 caracteres")
	private String email;
	
	@NotNull (message = "Campo obrigatório")
	@Size(min =  2, max = 254, message="Área de interesse deve conter entre 5 e 254 caracteres")
	private String areaInteresse;
	
		public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDataNascimento() {
		return datanasc;
	}
	public void setDataNascimento(int datanasc) {
		this.datanasc = datanasc;
	}
	public double getCPF() {
		return cpf;
	}
	public void setCPF(double cpf) {
		this.cpf = (int) cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getUF() {
		return uf;
	}
	public void setUF(String uf) {
		this.uf = uf;
	}
	public String getTelefone() {
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
	public String getAreaInteresse() {
		return areaInteresse;
	}
	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}
	

}