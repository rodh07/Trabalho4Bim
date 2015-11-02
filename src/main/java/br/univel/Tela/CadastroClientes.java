package br.univel.Tela;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class CadastroClientes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	
	public CadastroClientes() {
		super();
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(163, 11, 147, 22);
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
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(20, 90, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Endereco");
		lblNewLabel_3.setBounds(20, 124, 46, 14);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 87, 320, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 121, 320, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(20, 164, 46, 14);
		add(lblCidade);
		
		JLabel lblNewLabel_4 = new JLabel("Estado");
		lblNewLabel_4.setBounds(243, 164, 46, 14);
		add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(76, 161, 160, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(299, 161, 97, 20);
		add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setBounds(20, 207, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Genero");
		lblNewLabel_6.setBounds(20, 242, 46, 14);
		add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(76, 239, 320, 20);
		add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(76, 204, 320, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 278, 89, 23);
		add(btnAdicionar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(112, 278, 89, 23);
		add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(211, 278, 89, 23);
		add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(307, 278, 89, 23);
		add(btnPesquisar);
	}
}
