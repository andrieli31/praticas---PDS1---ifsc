package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Exe1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JLabel lblNascimento;
	private JTextField txtnacimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Exe1 frame = new Exe1();
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
	public Exe1() {
		setTitle("Cálculo de ano de nascimento");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNum = new JTextField();
		txtNum.setBounds(185, 24, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);

		JLabel lblNscimento = new JLabel("Idade:");
		lblNscimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNscimento.setBounds(44, 27, 46, 14);
		contentPane.add(lblNscimento);

		lblNascimento = new JLabel("Ano de nascimento:");
		lblNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNascimento.setBounds(44, 58, 103, 14);
		contentPane.add(lblNascimento);

		txtnacimento = new JTextField();
		txtnacimento.setEnabled(false);
		txtnacimento.setBounds(185, 55, 86, 20);
		contentPane.add(txtnacimento);
		txtnacimento.setColumns(10);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idade = txtNum.getText();

				int idade2 = Integer.valueOf(idade);
				int calc = (2023 - idade2);
				String calc2 = String.valueOf(calc);

				txtnacimento.setText(calc2);

			}
		});
		btnNewButton.setBounds(76, 122, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(231, 122, 89, 23);

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				txtNum.setText(null);
				txtnacimento.setText(null);
			}

		});
		contentPane.add(btnLimpar);
	}
}
