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
	private JTextField textNome;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textN3;

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
		contentPane.setBackground(new Color(217, 217, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNome = new JTextField();
		textNome.setBounds(281, 26, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textN1 = new JTextField();
		textN1.setBounds(281, 59, 86, 20);
		contentPane.add(textN1);
		textN1.setColumns(10);

		textN2 = new JTextField();
		textN2.setBounds(281, 90, 86, 20);
		contentPane.add(textN2);
		textN2.setColumns(10);

		textN3 = new JTextField();
		textN3.setBounds(281, 125, 86, 20);
		contentPane.add(textN3);
		textN3.setColumns(10);

		JLabel lblNome = new JLabel("Informe o nome do aluno:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNome.setBounds(10, 32, 291, 14);
		contentPane.add(lblNome);

		JLabel lblN1 = new JLabel("Informe primeira nota do aluno:");
		lblN1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblN1.setBounds(10, 65, 291, 14);
		contentPane.add(lblN1);

		JLabel lblN2 = new JLabel("Informe segunda nota do aluno:");
		lblN2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblN2.setBounds(10, 96, 291, 14);
		contentPane.add(lblN2);

		JLabel lblN3 = new JLabel("Informe terceira nota do aluno:");
		lblN3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblN3.setBounds(10, 131, 291, 14);
		contentPane.add(lblN3);

		JButton btnMedia = new JButton("CALCULAR");
		btnMedia.setBackground(Color.WHITE);
		btnMedia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMedia.setBounds(141, 185, 142, 23);
		contentPane.add(btnMedia);

		btnMedia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textN1.getText());
				Double n2 = Double.parseDouble(textN2.getText());
				Double n3 = Double.parseDouble(textN3.getText());
				String nome = textNome.getText();
				
				Double media = (n1+n2+n3)/3;

				JOptionPane.showMessageDialog(null, "Aluno: "+ nome);
				JOptionPane.showMessageDialog(null, "Média final do aluno: "+media);
			}

		});
	}
}