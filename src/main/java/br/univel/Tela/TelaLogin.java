package br.univel.Tela;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

public class TelaLogin extends JPanel {
	private JTextField txtLogin;
	private JPasswordField password;
	private JButton btnLogar;
	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setBackground(Color.GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblNewLabel = new JLabel("Login");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtLogin = new JTextField();
		GridBagConstraints gbc_txtLogin = new GridBagConstraints();
		gbc_txtLogin.insets = new Insets(0, 0, 5, 0);
		gbc_txtLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLogin.gridx = 0;
		gbc_txtLogin.gridy = 2;
		add(txtLogin, gbc_txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		password = new JPasswordField();
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.insets = new Insets(0, 0, 5, 0);
		gbc_password.fill = GridBagConstraints.HORIZONTAL;
		gbc_password.gridx = 0;
		gbc_password.gridy = 4;
		add(password, gbc_password);
		GridBagConstraints gbc_btnLogar = new GridBagConstraints();
		gbc_btnLogar.gridx = 0;
		gbc_btnLogar.gridy = 5;
		add(btnLogar, gbc_btnLogar);

	}
	
	public TelaLogin(Runnable action) {
		this();
		btnLogar.addActionListener(e -> {
			if (txtLogin.getText().trim().equals("1")
					&& new String(password.getPassword()).equals("1")) {
				action.run();
			} else {
				JOptionPane.showMessageDialog(TelaLogin.this,
						"Usuário e/ou senha inválidos!");
			}
		});

	}
}
