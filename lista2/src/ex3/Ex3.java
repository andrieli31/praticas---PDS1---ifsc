package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNa;
	private JTextField txtMatricula;
	private JTextField txtSiape;
	private JTextField txtCpf;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnCadastrar;
	private JButton btnAluno;
	private JButton btnProf;
	public ArrayList  <>

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNome.setBounds(124, 34, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDataNa = new JTextField();
		txtDataNa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDataNa.setBounds(124, 65, 86, 20);
		contentPane.add(txtDataNa);
		txtDataNa.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtMatricula.setBounds(323, 34, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtSiape = new JTextField();
		txtSiape.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtSiape.setBounds(323, 65, 86, 20);
		contentPane.add(txtSiape);
		txtSiape.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCpf.setBounds(124, 105, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Data de nascimento");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 68, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 108, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Matricula Aluno:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(215, 37, 114, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Siape Professor:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(215, 68, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastrar.setBounds(37, 153, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnAluno = new JButton("Alunos:");
		btnAluno.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAluno.setBounds(240, 153, 89, 23);
		contentPane.add(btnAluno);
		
		btnProf = new JButton("Professor ");
		btnProf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnProf.setBounds(240, 187, 89, 23);
		contentPane.add(btnProf);
		
		
	}

}
