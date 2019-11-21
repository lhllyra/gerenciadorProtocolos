package br.com.poli.gp.view;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.poli.gd.executa.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerHome implements Initializable {

	@FXML
	Button btn;

	@FXML
	TextField tf;

	@FXML
	public void clickAreaRestrita(ActionEvent event) {
		try {
			new Transicao("ViewLogin.fxml").start(Mainapp.stage); //troca para a pagina de login

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@FXML
	public void clickSair(ActionEvent event) {
		try {
			Mainapp.stage.close(); // fecha o programa
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@FXML
	public void clickSeguinte(ActionEvent event) {
		try {
			if (isTexto()) {
				new Transicao("ViewProtocolo.fxml").start(Mainapp.stage); // vai para a tela que mostra o protocolo
			} else {
				System.out.println("Número invalido, tente novamente"); // caso não digite um numero, essa mensagem vai aparecer no console
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/*
	 * Funcao que vai verificar se o texto contem apenas caracteres entre 48 e 57
	 * que são os valores dos inteiros.
	 */

	public boolean isTexto() {
		String texto = tf.getText();

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) < 48 || texto.charAt(i) > 57) {
				return false;
			}
		}

		return true;
	}

	/*
	 * Método para conversao do que será escrito no textfield para que assim possa
	 * ser utlizado em uma busca de um protocolo no repositório de array.
	 */

	public int castText() {
		return Integer.parseInt(tf.getText());

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
