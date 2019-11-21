package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class TransferInterna extends Protocolo {

	private String cursoNovo;
	private boolean status;

	public TransferInterna(String cursoNovo, Aluno aluno) {
		super(aluno);

		this.setStatus(status);
		this.setCursoNovo(cursoNovo);
	}

	// Mostra a parte especifica referente ao protocolo de transferencia interna
	@Override
	public String toString() {
		/*
		 * retorna o tostring ditoescrito na calsse pai e adicionará a ele dados do
		 * protocolo específico criado, no caso o de Transferencia interna.
		 */
		return super.toString() + "Transferência interna\n" + "Curso desejado: " + getCursoNovo() + "\nStatus: "
				+ getStatus();
	}

	public void setCursoNovo(String cursoNovo) {
		this.cursoNovo = cursoNovo;
	}

	public String getCursoNovo() {
		return this.cursoNovo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return this.status;
	}

	// mesma função existente e ja explicada em outras classes
	public String verificaStatus(boolean status) {
		if (status == true) {
			return "Aprovado";
		} else {
			return "negado";
		}
	}

}
