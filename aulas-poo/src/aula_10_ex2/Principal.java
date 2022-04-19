package aula_10_ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Cadastro cad = new Cadastro();
		try{
			int idade;
			
			idade = scan.nextInt();
			cad.setIdade( Integer.parseInt( JOptionPane.showInputDialog(null, "idade: ")));
			//			cad.setNome(scan.nextLine());
			cad.setIdade(scan.nextInt());
		
		} catch(InputMismatchException e) {
			System.out.println("erro: " + e);
		} catch(NumberFormatException ex){
			System.out.println("funcionou?");
		}
		
		scan.close();
	}
}