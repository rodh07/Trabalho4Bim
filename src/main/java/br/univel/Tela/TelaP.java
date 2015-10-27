package br.univel.Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaP extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaP frame = new TelaP();
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
	public TelaP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirTela();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mnNewMenu.add(mntmUsurio);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnNewMenu.add(mntmProduto);
		
		JMenu mnNewMenu_1 = new JMenu("Pesquisar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnNewMenu_1.add(mntmCliente);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Usu\u00E1rio");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmProduto_1 = new JMenuItem("Produto");
		mnNewMenu_1.add(mntmProduto_1);
		
		JMenu mnNewMenu_2 = new JMenu("Sair");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}
	
	private void abrirTela() {
		CadastroClientes CadCliente = new CadastroClientes();

}
}