package aula_8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JOptionPanel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Digite seu nome: ", "Bem vindo!",JOptionPane.PLAIN_MESSAGE);
		String nome = scan.nextLine();
		
		JOptionPane.showMessageDialog(null, "Digite sua idade: ", "Ol� " + nome ,JOptionPane.QUESTION_MESSAGE);
		int idade = scan.nextInt();
		
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " sua idade � " + idade, "Aperte ok para fechar!",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		
		scan.close();
		
		//		JOptionPane.showMessageDialog(null, "Hello", "MENSAGEM DE Atencao",JOptionPane.WARNING_MESSAGE);
	}
}
