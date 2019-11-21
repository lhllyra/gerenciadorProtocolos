package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class DispensaDisciplina extends Protocolo {

	private String disciplina;
	private String turma;
	private float preco;
	private boolean status;

	public DispensaDisciplina(String disciplina, String turma, Aluno aluno) {
		super(aluno);

		this.setDisciplina(disciplina);
		this.setTurma(turma);
		this.preco = 12.50f;
		this.setStatus(false);
	}

	public String getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getTurma() {
		return this.turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double getPreco() {
		return this.preco;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// vai verificar e retornar se o status do protocolo e trocar a forma dita no
	// console

	public String verifica(boolean status) {
		if (status == true) {
			return "Aprovado";
		} else {
			return "Negado";
		}
	}

	@Override
	public String toString() {
		/*
		 * Vai retornar a funcao toString da classe pai e vai retornar ela mais algumas
		 * informações adicionais sobre o protocolos.
		 */
		return super.toString() + "\nDispensa de disciplina \n" + "\nDisciplinas" + getDisciplina() + "\nTurma\n"
				+ getTurma() + "\nPreço:" + getPreco() + "\nStatus" + getStatus();
	}
}
