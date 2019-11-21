package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class SegundaChamada extends Protocolo{
	
	private String turma;
	private String disciplina;
	private float preco;
	private boolean status;
	
	public SegundaChamada(String turma, String disciplina, Aluno aluno) {
		super(aluno);
		
		this.setDisciplina(turma);
		this.setTurma(disciplina);
		this.preco = 50.0f;
		this.setStatus(false);
	}
		
	// vai verificar e retornar se o status do protocolo e trocar a forma dita no console
	public String verifica(boolean status) {
		if(status == true) {
			return "Aprovado";
		}
		else {
			return "Negado";
		}
	}
		
	@Override
	public String toString() {
		/*
		 * retorna o tostring ditoescrito na calsse pai 
		 * e adicionará a ele dados do protocolo específico criado,
		 * no caso o de Segunda Chamada.
		 */
		return super.toString() + "Sumario Segunda chamada\n" + "Turma: " + getTurma() + "\nDisciplina: " + getDisciplina() + 
				"\nPreço: " + "Status: " + getStatus();
	}
	
	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void setStatus(boolean b) {
		this.status = b;	
	}

	public boolean getStatus() {
		return this.status;
	}
	
	public float getPreco() {
		return this.preco;
	}

}
