package br.com.poli.gp.view;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.poli.gd.protocolos.RepositorioProtocolos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControllerProtocolo implements Initializable {

	@FXML
	Button btnVoltar;
	
	@FXML
	TextArea txtaProtocolo;
	
	@FXML
	public void clickVoltar() {
		try {
			new Transicao("viewHome.fxml").start(Mainapp.stage); // volta para a pagina home
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	
	/*
	 * Tentativa de fazer com que se imprima
	 * algum protocolo na TextArea.
	 */
	@FXML
	public void imprimeProtocolo() {
		RepositorioProtocolos b1 = new RepositorioProtocolos();
		txtaProtocolo.setText(b1.buscar(10).toString());
	}
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
