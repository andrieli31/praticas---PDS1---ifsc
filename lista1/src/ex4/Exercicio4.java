package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldN2;
	private JTextField textFieldN1;
	private JLabel num2;
	private JButton divisao;
	private JButton multiplicacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldN1 = new JTextField();
		textFieldN1.setBounds(251, 11, 86, 20);
		contentPane.add(textFieldN1);
		textFieldN1.setColumns(10);

		textFieldN2 = new JTextField();
		textFieldN2.setBounds(251, 57, 86, 20);

		contentPane.add(textFieldN2);
		System.out.println(textFieldN2);
		textFieldN2.setColumns(10);

		JLabel num1 = new JLabel("Informe o primeiro número: ");
		num1.setBounds(35, 14, 141, 14);
		contentPane.add(num1);

		num2 = new JLabel("Informe o segundo número: ");
		num2.setBounds(33, 60, 161, 14);
		contentPane.add(num2);

		JButton soma = new JButton("Soma: ");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double n1 = Double.parseDouble(textFieldN1.getText());
				Double n2 = Double.parseDouble(textFieldN2.getText());

				Double soma = (n1 + n2);

				JOptionPane.showMessageDialog(null, "Cálculo: " + soma);

			}
		});
		soma.setBounds(48, 133, 89, 23);
		contentPane.add(soma);

		JButton sub = new JButton("Subtração: ");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textFieldN1.getText());
				Double n2 = Double.parseDouble(textFieldN2.getText());

				Double subtracao = (n1 - n2);

				JOptionPane.showMessageDialog(null, "Cálculo: " + subtracao);

			}

		});

		sub.setBounds(48, 209, 89, 23);
		contentPane.add(sub);

		divisao = new JButton("Divisão: ");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textFieldN1.getText());
				Double n2 = Double.parseDouble(textFieldN2.getText());

				Double div = (n1 / n2);

				JOptionPane.showMessageDialog(null, "Cálculo: " + div);

			}
		});
		divisao.setBounds(251, 133, 126, 23);
		contentPane.add(divisao);

		multiplicacao = new JButton("Multiplicação: ");
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textFieldN1.getText());
				Double n2 = Double.parseDouble(textFieldN2.getText());

				Double mult = (n1 * n2);

				JOptionPane.showMessageDialog(null, "Cálculo : " + multiplicacao);
			
			}
		});
		multiplicacao.setBounds(251, 209, 126, 23);
		contentPane.add(multiplicacao);
	}
}