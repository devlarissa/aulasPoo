package aula_10_ex4;

public class SemLetraException extends Exception {

	@Override
	public String getMessage(){
		return "n�o existe letra b";
	}
}
