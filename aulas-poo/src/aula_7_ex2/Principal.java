package aula_7_ex2;

public class Principal {
	
	public static void main(String[] args) {
		Objeto objeto1 = null;
		
		int op = 2;
		
		switch(op){
		case 1:
			objeto1 = new Circulo();
			objeto1.lerDimensao(4.0);
			break;
				
		case 2: 
			objeto1 = new Triangulo();
			objeto1.lerDimensao(4.0, 6.0);
			break;
			
		case 3:
			objeto1 = new Quadrado();
			objeto1.lerDimensao(4.0, 6.0);
			break;
		}
		
		objeto1.calcularArea();

	}
}
