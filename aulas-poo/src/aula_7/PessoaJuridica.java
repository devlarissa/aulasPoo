package aula_7;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void mostraClasse(){
		System.out.println("Classe pessoa juridica");
	}

}
