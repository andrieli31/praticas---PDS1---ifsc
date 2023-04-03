package ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNome;
	private JTextField txtSobre;
	private JTextField txtData;
	private JTextField txtPessoa;
	private Pessoa pessoinha;
	private JButton btnExibe;
	private ArrayList<Pessoa> pessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 frame = new Tela2();
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
	public Tela2() {
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		pessoinha = new Pessoa();
		pessoas = new ArrayList<Pessoa>();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(33, 29, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblPnome = new JLabel("primeiro nome:");
		lblPnome.setBounds(33, 71, 46, 14);
		contentPane.add(lblPnome);

		JLabel lblSobre = new JLabel("Sobrenome:");
		lblSobre.setBounds(10, 96, 69, 14);
		contentPane.add(lblSobre);

		JLabel lblDataNasc = new JLabel("Data de nascimento ");
		lblDataNasc.setBounds(10, 121, 69, 14);
		contentPane.add(lblDataNasc);

		JLabel lblCadast = new JLabel("Pessoas cadastradas");
		lblCadast.setBounds(10, 168, 85, 14);
		contentPane.add(lblCadast);

		txtCpf = new JTextField();
		txtCpf.setBounds(108, 26, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(108, 68, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtSobre = new JTextField();
		txtSobre.setBounds(108, 93, 86, 20);
		contentPane.add(txtSobre);
		txtSobre.setColumns(10);

		txtData = new JTextField();
		txtData.setBounds(108, 118, 86, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);

		txtPessoa = new JTextField();
		txtPessoa.setEnabled(false);
		txtPessoa.setEditable(false);
		txtPessoa.setBounds(108, 165, 231, 195);
		contentPane.add(txtPessoa);
		txtPessoa.setColumns(10);

		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(348, 186, 135, 23);
		btnCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.getText();
				txtSobre.getText();
				txtCpf.getText();
				txtData.getText();
				pessoinha.setNome(txtNome.getText());
				pessoinha.setSobrenome(txtSobre.getText());
				pessoinha.setCpf(Long.parseLong(txtCpf.getText()));

				pessoinha.setDataNasc(txtData.getText());
				pessoas.add(pessoinha);
			}

		});

		contentPane.add(btnCadastro);

		btnExibe = new JButton("Exibir Cadastros");
		btnExibe.setBounds(348, 203, 135, 49);
		btnExibe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtPessoa.setText(pessoas.toString());
				txtNome.setText(null);
				txtCpf.setText(null);
				txtSobre.setText(null);
				txtData.setText(null);
			}

		});

		contentPane.add(btnExibe);
	}
}
