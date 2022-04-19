package aula_10_ex3;

import javax.swing.JOptionPane;

public class CalculadoraException {

public static void main(String[] args) {
		
		int numero1, numero2, result = 0;
		
		String operacao = JOptionPane.showInputDialog("Digite a operação: \nEx: som, sub, div, mult");
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		switch(operacao){
		case "som":
			result = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "O resultado é " + Float. toString(result), "result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "sub":
			result = numero1 - numero2;			
			JOptionPane.showMessageDialog(null, "O resultado é " + Float. toString(result), "result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "mult":
			result = numero1 * numero2;
			JOptionPane.showMessageDialog(null, "O resultado é " + Float. toString(result), "result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "div":
			
			try{
				result = numero1 / numero2;
			} catch(Exception e) {
//				essa essessao só é lancada pois o tipo de dados é inteiro. Se fosse ponto flutuante (d, f)
//				poderia ser NAN, positive_infinity ou negative_infinity
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "divisao por zero", JOptionPane.ERROR_MESSAGE);
			}
			break;
		}
		
	}
}
