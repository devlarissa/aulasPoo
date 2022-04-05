package aula_8;

import javax.swing.JOptionPane;

public class JOptionPaneYesNoOption {

	public static void main(String[] args) {
		
		int resp = JOptionPane.showConfirmDialog(null, "salvar", "salvando arquivo", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		if(resp == 0){
			JOptionPane.showMessageDialog(null, "retornou 0");
		}
		else if(resp == 1){
			JOptionPane.showMessageDialog(null, "retornou 1");
		}
		else{
			JOptionPane.showMessageDialog(null, "retornou 2");
		}
		
//		JOptionPane.showConfirmDialog(null, "salvar", "salvando arquivo", JOptionPane.ye,JOptionPane.QUESTION_MESSAGE);
	}
	
}
