package ex1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		Double precoLitro=0.0;
		Integer quantidadeLitro=0;
		
		String showInputDialog = JOptionPane.showInputDialog("Informe o preço do litro");

		if (showInputDialog.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhuma informação preenchida");
		} else {
			precoLitro = Double.valueOf(showInputDialog);
		}

		String showInputDialog2 = JOptionPane.showInputDialog("Informe a quantiade de litros");
		
		if (showInputDialog2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhuma informação inserida");
		} else {
			 quantidadeLitro = Integer.valueOf(showInputDialog2);
		}
		totalPagamento(precoLitro, quantidadeLitro);
	}

	public static void totalPagamento(Double precoLitro, Integer quantidadeLitro) {
		double calc = precoLitro * quantidadeLitro;
		JOptionPane.showMessageDialog(null, "Pagamento final: "+ calc);
	}

}
