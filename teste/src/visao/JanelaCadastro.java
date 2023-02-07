package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JanelaCadastro extends JFrame {

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelCPF = new JLabel("CPF: ");
		lblNewLabelCPF.setBounds(28, 65, 41, 19);
		lblNewLabelCPF.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblNewLabelCPF);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 66, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabelNome = new JLabel("Nome:");
		lblNewLabelNome.setBounds(28, 35, 46, 19);
		lblNewLabelNome.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(lblNewLabelNome);
		
		textField = new JTextField();
		textField.setBounds(81, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton txtBotao = new JButton("Finalizar!");
		txtBotao.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		txtBotao.setBounds(28, 98, 89, 23);
		txtBotao.setForeground(new Color(255, 128, 0));
		contentPane.add(txtBotao);
	}

}
