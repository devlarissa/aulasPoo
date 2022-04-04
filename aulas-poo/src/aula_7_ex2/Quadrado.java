package aula_7_ex2;

public class Quadrado extends Objeto{

	private double medida1;
	private double medida2;
	
	public void lerDimensao(double medida1, double medida2){
		this.medida1 = medida1;
		this.medida2 = medida2;
	}
	
	public void calcularArea(){
		System.out.println("A area é de: " + (this.medida1 * this.medida2));
	}
}