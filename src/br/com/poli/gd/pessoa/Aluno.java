/**
 * 
 */
package br.com.poli.gd.pessoa;

/**
 * @author pedro
 *
 **/

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, String email, String cpf, String curso, String endereco, String numTelefone) {
		super(nome, cpf, endereco, numTelefone, email);

		this.setCurso(curso);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
