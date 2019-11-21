package br.com.poli.gd.executa;

import java.sql.SQLException;

import br.com.poli.gd.bancoDados.*;
import br.com.poli.gd.pessoa.Aluno;

public class TesteBancodeDados {

	
	public static void main(String[] args) throws SQLException {
	
		Conexao conexao = new Conexao();
		RepositorioAlunos baluno = new RepositorioAlunos();
		Aluno a1 = new Aluno("pedro", "pvc", "70447872400", "computacao", "rua", "5442321");
		baluno.criaTabela();
		baluno.adiciona(a1);

	}
}
