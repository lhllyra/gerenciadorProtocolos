package br.com.poli.gp.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerFuncionario implements Initializable{
	
	@FXML
	Button btnCadastro;
	
	@FXML
	Button btnAltera;
	
	@FXML 
	Button btnSair;
	
	public void clickCadastro(ActionEvent event) {
		System.out.println("area em construção");
	}
	
	public void clickSair(ActionEvent event) {
		try {
			new Transicao("ViewLogin.fxml").start(Mainapp.stage);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
