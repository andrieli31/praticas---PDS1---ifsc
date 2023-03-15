package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JLabel lbll1;
	private JLabel lbll2;
	private JLabel lbll3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldLado3 = new JTextField();
		textFieldLado3.setBounds(197, 139, 86, 20);
		contentPane.add(textFieldLado3);
		textFieldLado3.setColumns(10);

		textFieldLado2 = new JTextField();
		textFieldLado2.setBounds(197, 94, 86, 20);
		contentPane.add(textFieldLado2);
		textFieldLado2.setColumns(10);

		textFieldLado1 = new JTextField();
		textFieldLado1.setBounds(197, 50, 86, 20);
		contentPane.add(textFieldLado1);
		textFieldLado1.setColumns(10);

		JLabel lblVerificaTriangulo = new JLabel("Verificação de triângulos ");
		lblVerificaTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerificaTriangulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblVerificaTriangulo.setBounds(100, 11, 239, 14);
		contentPane.add(lblVerificaTriangulo);

		lbll1 = new JLabel("Informe a primeira medida");
		lbll1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lbll1.setBounds(38, 52, 149, 14);
		contentPane.add(lbll1);

		lbll2 = new JLabel("Informe a segunda medida");
		lbll2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lbll2.setBounds(38, 97, 149, 14);
		contentPane.add(lbll2);

		lbll3 = new JLabel("Informe a terceira medida");
		lbll3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lbll3.setBounds(38, 142, 149, 14);
		contentPane.add(lbll3);

		JButton btnResult = new JButton("Verificação");
		btnResult.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnResult.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Double med1 = Double.parseDouble(textFieldLado1.getText());
				Double med2 = Double.parseDouble(textFieldLado2.getText());
				Double med3 = Double.parseDouble(textFieldLado3.getText());
				
				 

				if (Double.compare(med1, med2) == 0 && Double.compare(med1, med3) == 0
						&& Double.compare(med2, med3) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo equilátero");
				} else if (Double.compare(med1, med2) == 0 || Double.compare(med1, med3) == 0
						|| Double.compare(med2, med3) == 0 || Double.compare(med3, med2) == 0) {
					JOptionPane.showMessageDialog(null, "Triângulo isósceles");
				
				} else {
					JOptionPane.showMessageDialog(null, "Triângulo escaleno");

				}

			}

		});
		btnResult.setBounds(157, 227, 89, 23);

		contentPane.add(btnResult);
	}
}