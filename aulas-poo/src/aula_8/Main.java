package aula_8;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op = JOptionPane.showConfirmDialog(null, "Voce quer buscar ou cadastrar um cliente?", "Olá", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		int tel;
		String nome, end, email, cpf;
		
		LinkedList<Cliente> listaDeClientes = new LinkedList<Cliente>();
		
		if(op == 0){
			nome = JOptionPane.showInputDialog("Digite seu nome: ");
			end = JOptionPane.showInputDialog("Digite seu endereco: ");
			email = JOptionPane.showInputDialog("Digite seu email: ");
			cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
			tel = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone: "));
			
			Cliente cliente = new Cliente(nome, end, email, cpf, tel);
			listaDeClientes.add(cliente);
			
			JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso");
		}
		else{
			int posicao = Integer.parseInt(JOptionPane.showInputDialog("Qual o id que quer buscar?"));
			JOptionPane.showMessageDialog(null, "O cliente é: " + listaDeClientes.get(posicao));
		}
	}
}
