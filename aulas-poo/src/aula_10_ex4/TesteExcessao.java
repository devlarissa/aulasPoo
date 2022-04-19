package aula_10_ex4;

public class TesteExcessao {

	public static void main(String[] args) throws SemLetraException {
		String frase = "sou um teste!";
//		quando não uso try catch posso usar o throws e o lancamento de erro new throw pra substituir
		if(!frase.contains("b") || !frase.contains("B")){
			throw new SemLetraException();
		}

	}

}
