package br.com.poli.gd.bancoDados;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.poli.gd.protocolos.*;

public class RepositorioProtocolos extends Repositorio {

	/*
	 * @see br.com.poli.gd.bancoDados.Repositorio#criaTabela()
	 */
	@Override
	public void criaTabela() throws SQLException {
		Conexao conexao = new Conexao();

		String sql = "CREATE TABLE IF NOT EXISTS tbl_protocolo" + "(" + "id integer PRIMARY KEY AUTOINCREMENT NOT NULL,"
				+ "numProtocolo STRING," + "status INT" + ");";

		Statement stmt = conexao.criarStatement();

		stmt.execute(sql);

		conexao.desconectar();
	}
	
	/*
	 * Vai adicionar um protocolo no banco de daos,
	 * Por enquanto só está adicionando o protocolo basico
	 * mas sera feito uma tabela para cada tipo de protocolo.
	 */
	public void adiciona(Protocolo a) {
		Conexao conexao = new Conexao();
		try {
			Statement stmt = conexao.criarStatement();

			String comando = "INSERT INTO tbl_protocolo(numProtocolo, status)" + "VALUES (" + a.getNumProtocolo() + ","
					+ 1 + ");";

			stmt.executeUpdate(comando);
			stmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			if (conexao != null) {
				conexao.desconectar();
			}
		}
	}

	/*
	 * @see br.com.poli.gd.bancoDados.Repositorio#busca()
	 */
	@Override
	public void busca() {
		// TODO Auto-generated method stub

	}

	/*
	 * @see br.com.poli.gd.bancoDados.Repositorio#exclui()
	 */
	@Override
	public void exclui() {
		// TODO Auto-generated method stub

	}

}
