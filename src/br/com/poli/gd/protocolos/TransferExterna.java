package br.com.poli.gd.protocolos;

import br.com.poli.gd.pessoa.Aluno;

public class TransferExterna extends Protocolo {
	
	private String faculatual; //refere-se a faculdade atual do aluno
	private String faculDestino; // refere-se a faculdade a que o aluno deseja transferir
	private boolean status; // status do protocolo
	
	public TransferExterna(String faculdade, String faculDestino, Aluno aluno) {
		super(aluno);
		
		this.setFacul(faculdade);
		this.setFaculDestino(faculDestino);
		this.setStatus(false);
	}
	
	public String getFacul() {
		return faculatual;
	}
	
	public void setFacul(String facul) {
		this.faculatual = facul;
	}
	
	public String getFaculDestino() {
		return faculDestino;
	}
	
	public void setFaculDestino(String faculDestino) {
		this.faculDestino = faculDestino;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
		
	public String verificaStatus(boolean status) {
		if(status == true) {
			return "Aprovado";
		}
		else {
			return "Rejeitado";
		}
	}
	
	@Override
	public String toString() {		
		/*
		 * retorna o tostring dito escrito na calsse pai 
		 * e adicionará a ele dados do protocolo específico criado,
		 * no caso o de Transferencia externa.
		 */
		return super.toString() + "Transferencia externa\n" + "Faculdade atual: " + getFacul() + "\nFaculdade destino" + getFaculDestino() +
				"\nStatus: " + getStatus();
	}

}