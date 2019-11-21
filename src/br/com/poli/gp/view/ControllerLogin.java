package br.com.poli.gp.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerLogin implements Initializable {

	@FXML
	TextField tfLogin;

	@FXML
	TextField tfSenha;

	@FXML
	Button btnLogin;

	@FXML
	Button btnVoltar;

	/*
	 * Faz você voltar para a tela inicial ao clicar no botão de voltar localizado
	 * na tela de Login do funcionario.
	 */
	@FXML
	public void clickVoltar(ActionEvent event) {
		try {
			new Transicao("ViewHome.fxml").start(Mainapp.stage);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@FXML
	public void clickLogin() {
		try {
			new Transicao("ViewFuncionario.fxml").start(Mainapp.stage); //vai para a tela de funcionario, ao fazer o login
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
/*
 * Login não foi implementado da forma que deve ser ainda.
 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
