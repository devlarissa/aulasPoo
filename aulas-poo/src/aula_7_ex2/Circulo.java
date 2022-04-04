package aula_7_ex2;

public class Circulo extends Objeto {

	private double medida1;
	
	public void lerDimensao(double medida1){
		this.medida1 = medida1;
	}
	
	public void calcularArea(){
		System.out.println("A area é de: " + (2 * Math.PI * Math.pow(medida1, 2.0)));
	}
}
