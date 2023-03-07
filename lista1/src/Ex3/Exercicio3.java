package Ex3;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Double nota1 = 0.0;
		Double nota2 = 0.0;
		Double nota3 = 0.0;
		
		String n1 = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
		String n2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		String n3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
		
		nota1 = Double.valueOf(n1);
		nota2 = Double.valueOf(n2);
		nota3 = Double.valueOf(n3);
		
		mediaCalc(nota1, nota2, nota3);
		
	}
	
	public static void mediaCalc(Double nota1, Double nota2, Double nota3){
		Double mf = (nota1+nota2+nota3)/3;
		
		if (mf >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado, média final: " + mf);
		}
		if (mf < 6) {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação, média final: " + mf);
		}
		if (mf <4 ) {
			JOptionPane.showMessageDialog(null, "Aluno reprovado, média final: " + mf);
		}
	}

}
