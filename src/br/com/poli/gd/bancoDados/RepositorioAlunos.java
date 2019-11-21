package br.com.poli.gd.bancoDados;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.poli.gd.pessoa.Aluno;

public class RepositorioAlunos extends Repositorio {
	
	/*
	 * @see br.com.poli.gd.bancoDados.Repositorio#criaTabela()
	 */
	
	@Override
	public void criaTabela() throws SQLException {
		Conexao conexao = new Conexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS tbl_aluno"
				+"("
				+"id integer PRIMARY KEY AUTOINCREMENT NOT NULL,"
				+"cpf STRING,"
				+"nome STRING,"
				+"email STRING,"
				+"numTelefone STRING,"
				+"endereco STRING,"
				+"curso STRING" + ");";
		
		Statement stmt = conexao.criarStatement();
		
		stmt.execute(sql);
		
		conexao.desconectar();
	}
	
	/*
	 * Vai conectar com o banco de dados,
	 * receber um aluno e inserir no banco de dados.
	 */
	public void adiciona(Aluno a) {
		Conexao conexao = new Conexao();
		try {
			
			Statement stmt = conexao.criarStatement();
			
			String comando = "INSERT INTO tbl_aluno (cpf,"
					+ "nome,"
					+ "email,"
					+ "numTelefone,"
					+ "endereco,"
					+ "curso"
					+ ")" 
					+ "VALUES('"
					+ a.getCPF() + "','"
					+ a.getNome() + "','" 
					+ a.getEmail() + "','" 
					+ a.getNumTelefone() + "','"
					+ a.getEndereco() + "','"
					+ a.getCurso() + "');";
			
			
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
