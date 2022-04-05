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
		
		
/**As caixas de confirma��o permitem responder algum questionamento, pelos bot�es Yes, No e 
 * Cancel. Uma vez escolhida uma op��o, dependendo da escolha, o showconfirmdialog retorna um
 * numero inteiro, yes_option = 0, no_option = 1 e cancel_option = 2, isso permite identificar a op��o eascolhida.
 * 
 * Existem 3 op��es de caixas: yes_no_option ou 0
 * 							   yes_no_cancel_option ou 1
 * 							   ok_cancel_option ou 2
 * 
 * sintaxe: int resp = JOptionPane.showCorfirmDialog(component, "ensagem", "titulo", <botoes>, <tipomensagem>)
 *
 * ex: 
 * resp = JOptionPane.showCorfirmDialog(numm, "salvar", "salvando arquivo", JOptionPane.yes_no_cancel_option, JOptionPane.QUESTION_MESSAGE);
**/
		
		
		scan.close();
		
		//		JOptionPane.showCorfirmDialog(null, "Hello", "MENSAGEM DE Atencao",JOptionPane.WARNING_MESSAGE);
	}
}
