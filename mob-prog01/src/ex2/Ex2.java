package ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNumr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {

		setTitle("Gerador de senha");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn = new JButton("Gerar próxima senha");
		btn.setBounds(155, 122, 89, 23);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double num1 = Math.random();
				Double num2 = Math.random();
				Double num3 = Math.random();
				txtNum1.setText(String.valueOf(num1));
				txtNum2.setText(String.valueOf(num2));
				txtNumr3.setText(String.valueOf(num3));
			}

		});

		contentPane.add(btn);

		txtNum1 = new JTextField();
		txtNum1.setEditable(false);
		txtNum1.setEnabled(false);
		txtNum1.setBounds(124, 73, 36, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Senha:");
		lblNewLabel.setBounds(29, 76, 46, 14);
		contentPane.add(lblNewLabel);

		txtNum2 = new JTextField();
		txtNum2.setEditable(false);
		txtNum2.setEnabled(false);
		txtNum2.setBounds(196, 73, 36, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);

		txtNumr3 = new JTextField();
		txtNumr3.setEditable(false);
		txtNumr3.setEnabled(false);
		txtNumr3.setBounds(270, 73, 36, 20);
		contentPane.add(txtNumr3);
		txtNumr3.setColumns(10);

	}


}
