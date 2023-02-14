package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastro frame = new JanelaCadastro();
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
	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(145, 145, 176));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelCPF = new JLabel("CPF: ");
		lblNewLabelCPF.setBounds(30, 84, 41, 19);
		lblNewLabelCPF.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblNewLabelCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(81, 81, 86, 29);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblNewLabelNome = new JLabel("Nome:");
		lblNewLabelNome.setBounds(28, 35, 46, 19);
		lblNewLabelNome.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblNewLabelNome);
		
		textNome = new JTextField();
		textNome.setBounds(81, 32, 86, 29);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JButton txtBotao = new JButton("Salvar!");
		txtBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//armazane as variaveis para serem utulizadas
			String nome = textNome.getText();
			String cpf = textCPF.getText();
			
				//validação
			if(!nome.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Nenhum nome preenchido!");
			}
			if(!cpf.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Nenhum cpf preenchido!");
			}
			
			Funcionario func = new Funcionario();
			func.setNome(nome);
			func.setCpf(Long.valueOf(cpf));
			
			FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
			bdPessoa.inserir(func);
			
			
			}
		});
		txtBotao.setBackground(new Color(255, 255, 255));
		txtBotao.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		txtBotao.setBounds(66, 121, 120, 29);
		txtBotao.setForeground(new Color(0, 0, 0));
		contentPane.add(txtBotao);
	}

}
