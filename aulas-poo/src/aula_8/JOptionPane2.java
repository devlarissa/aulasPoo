package aula_8;

import javax.swing.JOptionPane;

public class JOptionPane2 {

	public static void main(String[] args) {
		
		
//		JOptionPane.showMessageDialog(null, "Digite seu nome: ", "Bem vindo!",JOptionPane.PLAIN_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite seu nome: ", "Exemplo de entrada default");
		
//		JOptionPane.showMessageDialog(null, "Digite sua idade: ", "Ol� " + nome ,JOptionPane.QUESTION_MESSAGE);
		String idade = JOptionPane.showInputDialog("Digite sua idade: ");
		
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " sua idade � " + idade, "Aperte ok para fechar!",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		
		
		//		JOptionPane.showMessageDialog(null, "Hello", "MENSAGEM DE Atencao",JOptionPane.WARNING_MESSAGE);
	}
}
