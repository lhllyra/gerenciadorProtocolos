package br.com.poli.gd.bancoDados;

import java.sql.SQLException;

import br.com.poli.gd.protocolos.Protocolo;

public abstract class Repositorio {
	/*
	 * Vai criar uma tabela, da forma que sera explicitada
	 * em cada classe.
	 */
	public abstract void criaTabela() throws SQLException;
	
	/*
	 * Vai buscar ao no sql,
	 * e vai pesquisar de formas diferentes em protocolo
	 * e aluno.
	 */
	public abstract void busca();
	
	/*
	 * Vai excluir algo da tabela.
	 */
	public abstract void exclui();

}
