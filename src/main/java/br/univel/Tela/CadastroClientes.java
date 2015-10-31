package br.univel.Tela;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroClientes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	public CadastroClientes() {
		super();
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setBounds(187, 11, 113, 22);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(39, 55, 27, 14);
		add(lblNewLabel_1);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(282, 55, 46, 14);
		add(lblId);
		
		textField = new JTextField();
		textField.setBounds(310, 52, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 52, 190, 20);
		add(textField_1);
		textField_1.setColumns(10);
	}
}
