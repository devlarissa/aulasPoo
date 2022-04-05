package aula_8;

public class Cliente {

	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private int telefone;
	
	public Cliente(String nome, String end, String email, String cpf, int tel) {
		this.nome = nome;
		this.endereco = end;
		this.email = email;
		this.cpf = cpf;
		this.telefone = tel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
