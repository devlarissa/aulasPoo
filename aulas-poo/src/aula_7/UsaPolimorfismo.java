package aula_7;

public class UsaPolimorfismo {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = null;
		int op;
		
		op=4;
		switch(op){
		case 1:
			pessoa = new Pessoa();
			break;
				
		case 2: 
			pessoa = new PessoaFisica();
			break;
			
		case 3:
			pessoa = new PessoaJuridica();
			break;
		
		case 4:
			pessoa = new Funcionario();
			break;
		}
		
		pessoa.mostraClasse();
	}

}
