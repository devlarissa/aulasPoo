package aula_8;

import javax.swing.JOptionPane;

public class CalculadoraJOptioPane {

	public static void main(String[] args) {
		
		float numero1, numero2, result = 0;
		
		String operacao = JOptionPane.showInputDialog("Digite a opera��o: \nEx: som, sub, div, mult");
		numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		switch(operacao){
		case "som":
			result = numero1 + numero2;
			break;
		case "sub":
			result = numero1 - numero2;
			break;
		case "mult":
			result = numero1 * numero2;
			break;
		case "div":
			if(numero2 == 0.0){
				JOptionPane.showMessageDialog(null, "n�o � possivel dividir por zero", "divisao por zero", JOptionPane.ERROR_MESSAGE);
			} else {
				result = numero1 / numero2;
			}
			break;
		}
		
		JOptionPane.showMessageDialog(null, "O resultado � " + Float. toString(result), "result", JOptionPane.INFORMATION_MESSAGE);
	}
}
