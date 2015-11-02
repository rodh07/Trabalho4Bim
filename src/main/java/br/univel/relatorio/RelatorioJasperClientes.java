package br.univel.relatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioJasperClientes {

	private String arq = "D:\\MyReports\\RelatorioClientes.jasper";

	public 	RelatorioJasperClientes() {

		JasperPrint jasperPrint = null;
		try {
			Connection con = getConnection();
			jasperPrint = JasperFillManager.fillReport(arq, null,con);
			
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
			System.out.println("erro no jasper");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erro no banco");
		}
	}

	private Connection getConnection() throws SQLException {
           //Ip Local
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.6/Trabalho4Bim", "jasper", "jasper");

		return con;
	}

	public static void main(String[] args) {
		new RelatorioJasperClientes();
	}
}
