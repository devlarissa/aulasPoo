package aula_10;

public class Error1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, res;
		
		try{
			for(i = 10; i >= 0; i--){
				res = 10 / i;
				System.out.println(res);
			}
		} catch( Error e) {
			System.out.println("erro: " + e.getMessage());
		}
	}
}