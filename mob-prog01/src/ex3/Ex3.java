package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField textField_3;
	private JTextField txtFabri;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setTitle("Cadastro de Veiculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(71, 227, 111, 23);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeUserString = txtNome.getText();
				String modelo = txtModelo.getText();
				String ano = txtAno.getText();
				String fabricante = txtFabri.getText();

				String total = (nomeUserString + " " + modelo + " " + ano + " " + fabricante);

				textField_3.setText(total);

			}

		});
		contentPane.add(btnNewButton);

		txtNome = new JTextField();
		txtNome.setBounds(208, 31, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtModelo = new JTextField();
		txtModelo.setBounds(208, 75, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setBounds(71, 34, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(71, 78, 46, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(192, 227, 89, 23);

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtModelo.setText(null);
				txtAno.setText(null);
				txtFabri.setText(null);
			}

		});
		contentPane.add(btnNewButton_1);

		txtAno = new JTextField();
		txtAno.setBounds(208, 106, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setEnabled(false);
		textField_3.setBounds(57, 196, 278, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Ano:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(71, 109, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Fabricante:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(71, 151, 127, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Veiculo Cadastrado:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setBounds(71, 176, 114, 14);
		contentPane.add(lblNewLabel_4);

		txtFabri = new JTextField();
		txtFabri.setBounds(208, 148, 86, 20);
		contentPane.add(txtFabri);
		txtFabri.setColumns(10);
	}

}
