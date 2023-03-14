package ex4;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JLabel lbln1 = new JLabel("Informe o primeiro número: ");
		lbln1.setBounds(25, 11, 150, 14);
		contentPane.add(lbln1);
		
		JLabel lbln2 = new JLabel("Informe o segundo número: ");
		lbln2.setBounds(25, 36, 150, 15);
		contentPane.add(lbln2);
		
		textField = new JTextField();
		textField.setBounds(165, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 36, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton soma = new JButton("Soma: ");
		soma.setBounds(25, 62, 107, 23);
		contentPane.add(soma);
		
		
		
		JButton subtracao = new JButton("Subtração: ");
		subtracao.setBounds(25, 96, 107, 23);
		contentPane.add(subtracao);
		
		JButton mult = new JButton("Multiplicação: ");
		mult.setBounds(25, 130, 107, 23);
		contentPane.add(mult);
		
		JButton div = new JButton("Divisão: ");
		div.setBounds(25, 164, 107, 23);
		contentPane.add(div);
		
		
		
		
	}
}
