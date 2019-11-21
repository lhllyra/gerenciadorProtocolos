package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class Desligamento extends Protocolo {

	private boolean status;
	private String motivo;

	public Desligamento(Aluno aluno, String motivo) {
		super(aluno);
		
		setMotivo(motivo);
		setStatus(true);
	}

	// verifica se o protocolo está aprovado ou negado
	public String verificaStatus(boolean status) {

		if (status == true) {
			return "Aprovado";
		} else {
			return "Negado";
		}
	}

	@Override
	public String toString() {
		// super.toString(aluno);//recebe da classe pai a funcao to string

		return super.toString() + "Sumário desligamento:\n\n" + "Status: " + getStatus() + "\n Comentarios: "
				+ getMotivo(); // adiciona algumas
																							// informações adicionais do
																							// protocolo ao tostring
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return this.status;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}
