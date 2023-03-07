package ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		ArrayList<String> listinha = new ArrayList<String>();
		
		
		for (int i = 0; i < 10; i++) {
			String valor = JOptionPane.showInputDialog("Informe algo");
			listinha.add(valor);
			
		}
		JOptionPane.showMessageDialog(null, listinha);

	}

}
