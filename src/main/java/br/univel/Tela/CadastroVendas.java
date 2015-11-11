package br.univel.Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class CadastroVendas extends JFrame {

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
					CadastroVendas frame = new CadastroVendas();
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
	public CadastroVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeVendas = new JLabel("Cadastro de vendas");
		lblCadastroDeVendas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastroDeVendas.setBounds(178, 11, 286, 27);
		contentPane.add(lblCadastroDeVendas);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero da nota:");
		lblNewLabel.setBounds(21, 57, 81, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente:");
		lblNewLabel_1.setBounds(65, 84, 37, 21);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(109, 57, 342, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(108, 84, 343, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(109, 116, 342, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Produto:");
		lblNewLabel_2.setBounds(60, 116, 42, 21);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 143, 342, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade:");
		lblNewLabel_3.setBounds(42, 143, 60, 21);
		contentPane.add(lblNewLabel_3);
	}
}
