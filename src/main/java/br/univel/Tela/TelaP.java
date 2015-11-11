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

import br.univel.Login.TelaBloqueio;
import br.univel.Login.TelaLogin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaP extends JFrame {
 
	
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private TelaBloqueio Bloqueio;

	
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
		
		//bloqueioParaLogin();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuCadastro = new JMenu("Cadastros");
		menuBar.add(MenuCadastro);
		
		JMenuItem CadCliente = new JMenuItem("Cliente");
		CadCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroCliente cadCliente = new CadastroCliente();
				cadCliente.setVisible(true);
				cadCliente.setLocationRelativeTo(null);
				
			}
		});
		MenuCadastro.add(CadCliente);
		
		JMenuItem CadUsuario = new JMenuItem("Usu\u00E1rio");
		CadUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroUsuario cadUsuario = new CadastroUsuario();
				cadUsuario.setVisible(true);
				cadUsuario.setLocationRelativeTo(null);
			}
		});
		MenuCadastro.add(CadUsuario);
		
		JMenuItem CadProduto = new JMenuItem("Produto");
		CadProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastroProdutos cadProduto = new CadastroProdutos();
				cadProduto.setVisible(true);
				cadProduto.setLocationRelativeTo(null);
			}
		});
		MenuCadastro.add(CadProduto);
		
		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mntmVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroVendas cadVenda = new CadastroVendas();
				cadVenda.setVisible(true);
				cadVenda.setLocationRelativeTo(null);
			}
		});
		MenuCadastro.add(mntmVendas);
		
		JMenu MenuPesquisar = new JMenu("Pesquisar");
		menuBar.add(MenuPesquisar);
		
		JMenuItem PesqCliente = new JMenuItem("Cliente");
		MenuPesquisar.add(PesqCliente);
		
		JMenuItem PesqUser = new JMenuItem("Usu\u00E1rio");
		MenuPesquisar.add(PesqUser);
		
		JMenuItem PesqProd = new JMenuItem("Produto");
		MenuPesquisar.add(PesqProd);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem ATSmenu = new JMenuItem("About this system");
		mnNewMenu_2.add(ATSmenu);
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
//	//Ativar bloqueio do Login.
//	private void bloqueioParaLogin() {
//		Runnable action = () -> {
//			Bloqueio.setVisible(false);
//			Bloqueio = new TelaBloqueio();
//		};
//
//		TelaLogin telaLogin = new TelaLogin(action);
//
//		TelaBloqueio bloqque= new TelaBloqueio();
//
//		setGlassPane(Bloqueio);
//
//		 Bloqueio.setVisible(true);
//	
//	
//}
}