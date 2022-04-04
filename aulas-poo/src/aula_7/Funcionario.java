package aula_7;

public class Funcionario extends PessoaJuridica {
	
	private String cartao;

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public void mostraClasse(){
		System.out.println("Classe funcionario");
	}

}
