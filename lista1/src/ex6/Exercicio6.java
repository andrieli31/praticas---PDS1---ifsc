package ex6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Exercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6 frame = new Exercicio6();
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
	public Exercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome do aluno (a): ");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNome.setBounds(28, 41, 134, 39);
		contentPane.add(lblNome);

		JLabel lblCalculaMedia = new JLabel("Calculadora de média");
		lblCalculaMedia.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculaMedia.setBounds(72, 12, 240, 19);
		lblCalculaMedia.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lblCalculaMedia);

		JLabel lblNota1 = new JLabel("Informe a primeiro nota: ");
		lblNota1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNota1.setBounds(28, 91, 134, 14);
		contentPane.add(lblNota1);

		JLabel lblNota2 = new JLabel("Informe a segunda nota: ");
		lblNota2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNota2.setBounds(28, 130, 134, 14);
		contentPane.add(lblNota2);

		JLabel lblNota3 = new JLabel("Informe a terceira nota: ");
		lblNota3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNota3.setBounds(28, 169, 134, 14);
		contentPane.add(lblNota3);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(172, 47, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldN1 = new JTextField();
		textFieldN1.setBounds(172, 85, 86, 20);
		contentPane.add(textFieldN1);
		textFieldN1.setColumns(10);

		textFieldN2 = new JTextField();
		textFieldN2.setBounds(172, 124, 86, 20);
		contentPane.add(textFieldN2);
		textFieldN2.setColumns(10);

		textFieldN3 = new JTextField();
		textFieldN3.setBounds(172, 163, 86, 20);
		contentPane.add(textFieldN3);
		textFieldN3.setColumns(10);

		JButton btnCalc = new JButton("FAZER CÁLCULO");
		btnCalc.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnCalc.setBounds(279, 93, 147, 36);

		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double num1 = Double.parseDouble(textFieldN1.getText());
				Double num2 = Double.parseDouble(textFieldN2.getText());
				Double num3 = Double.parseDouble(textFieldN3.getText());
				String nome = textFieldNome.getText();


				JOptionPane.showMessageDialog(null, "NOME ESTUDANTE: " + nome);
				 calculaMedia(num1, num2, num3);

			}

		});

		contentPane.add(btnCalc);
	}

	public static void calculaMedia(Double num1, Double num2, Double num3) {
		Double media = (num1 + num2 + num3) / 3;

		JOptionPane.showMessageDialog(null, "Média final: " + media);
	}
}
