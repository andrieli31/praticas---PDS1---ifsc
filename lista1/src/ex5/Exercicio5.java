package ex5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;

public class Exe5 extends JFrame {

	private JPanel contentPane;
	private JTextField textL1;
	private JTextField textL2;
	private JTextField textL3;
	private JButton btnBotao;
	private int num1;
	private int num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe5 frame = new Exe5();
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
	public Exe5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textL1 = new JTextField();
		textL1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textL1.setBounds(309, 11, 86, 20);
		contentPane.add(textL1);
		textL1.setColumns(10);
		
		textL2 = new JTextField();
		textL2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textL2.setBounds(309, 46, 86, 20);
		contentPane.add(textL2);
		textL2.setColumns(10);
		
		textL3 = new JTextField();
		textL3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textL3.setBounds(309, 77, 86, 20);
		contentPane.add(textL3);
		textL3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Informe o primeiro lado do triângulo: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(34, 14, 265, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe o segundo lado do triângulo: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(34, 49, 265, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Informe o terceiro lado do triângulo: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(34, 80, 265, 14);
		contentPane.add(lblNewLabel_2);
		
		btnBotao = new JButton("VERIFICAÇÃO");
		btnBotao.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnBotao.setBounds(137, 141, 162, 23);
		contentPane.add(btnBotao);
		
		btnBotao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textL1.getText());
				int num2 = Integer.parseInt(textL2.getText());
				int num3 = Integer.parseInt(textL3.getText());
				
				
				if(num1 == num2 && num1 == num3 && num3 == num2) {
					JOptionPane.showMessageDialog(null, "Triângulo equilátero");
				} if (num1 != num2 && num1 != num3 && num2 != num3) {
					JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
				}else {
					JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
				}
				
				
			}
			
		});
	}

}
