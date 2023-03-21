package ex4;

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
import java.awt.Color;

public class Exe4 extends JFrame {

	private JPanel Painel;
	private JTextField textNum1;
	private JTextField textNum2;
	private Double n1;
	private Double n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe4 frame = new Exe4();
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
	public Exe4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Painel = new JPanel();
		Painel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Painel);
		Painel.setLayout(null);

		textNum1 = new JTextField();
		textNum1.setBounds(214, 11, 86, 20);
		Painel.add(textNum1);
		textNum1.setColumns(10);

		textNum2 = new JTextField();
		textNum2.setBounds(214, 56, 86, 20);
		Painel.add(textNum2);
		textNum2.setColumns(10);

		JLabel lblNewCampo1 = new JLabel("Informe o primeiro número: ");
		lblNewCampo1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewCampo1.setBounds(25, 14, 179, 14);
		Painel.add(lblNewCampo1);

		JLabel lblNewCampo2 = new JLabel("Informe o segundo número: ");
		lblNewCampo2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewCampo2.setBounds(25, 59, 179, 14);
		Painel.add(lblNewCampo2);

		JButton btnSoma = new JButton("Soma: ");
		btnSoma.setBackground(Color.WHITE);
		btnSoma.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSoma.setBounds(25, 110, 111, 23);
		Painel.add(btnSoma);

		btnSoma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textNum1.getText());
				Double n2 = Double.parseDouble(textNum2.getText());

				Double som = n1 + n2;

				JOptionPane.showMessageDialog(null, "Soma dos valores: " + som);

			}

		});

		JButton btnSub = new JButton("Subtração: ");
		btnSub.setBackground(Color.WHITE);
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSub.setBounds(25, 159, 111, 23);
		Painel.add(btnSub);

		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			
				Double numero1 = Double.parseDouble(textNum1.getText());
				Double numero2 = Double.parseDouble(textNum2.getText());

				Double subtracao = (numero1 - numero2);

				JOptionPane.showMessageDialog(null, "Subtração dos valores: " + subtracao);

			}

		});
		JButton btnMult = new JButton("Muliplicação: ");
		btnMult.setBackground(Color.WHITE);
		btnMult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnMult.setBounds(211, 110, 111, 23);
		Painel.add(btnMult);

		btnMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textNum1.getText());
				Double n2 = Double.parseDouble(textNum2.getText());

				Double mult = n1 * n2;

				JOptionPane.showMessageDialog(null, "Multiplicação dos valores: " + mult);
			}

		});

		JButton btnDiv = new JButton("Divisão: ");
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDiv.setBounds(214, 159, 108, 23);
		Painel.add(btnDiv);

		btnMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.parseDouble(textNum1.getText());
				Double n2 = Double.parseDouble(textNum2.getText());

				Double div = n1 / n2;

				JOptionPane.showMessageDialog(null, "Divisão dos valores: " + div);
			}

		});

	}
}
