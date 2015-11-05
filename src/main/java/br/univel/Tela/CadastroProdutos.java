package br.univel.Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class CadastroProdutos extends JFrame {

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
					CadastroProdutos frame = new CadastroProdutos();
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
	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de produtos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(148, 5, 143, 30);
		panel.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(70, 49, 46, 14);
		panel.add(lblId);
		
		JLabel lblNome = new JLabel("C\u00F3digo de barras:");
		lblNome.setBounds(0, 88, 94, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(93, 46, 282, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 85, 283, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSalvar = new JButton("Adicionar");
		btnSalvar.setBounds(286, 197, 89, 23);
		panel.add(btnSalvar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(93, 127, 282, 20);
		panel.add(comboBox);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(34, 130, 82, 14);
		panel.add(lblCategoria);
		
		JButton btnEcvluir = new JButton("Excluir");
		btnEcvluir.setBounds(178, 197, 89, 23);
		panel.add(btnEcvluir);
	}
}
