package br.com.poli.gd.protocolos;


public class RepositorioProtocolos {
	
	/**
	 * array onde será armazenado os protocolos
	 **/
	private Protocolo [] protocolo = new Protocolo[10];
	
	private int qntProtocolo = 0;
	
	
	/*
	 *Inclui um protocolo no repositorio, 
	 *quando o mesmo não tem mais de 10 elementos 
	 */
	
	public void addProtocolo(Protocolo novoProtocolo) {
		
		int numProtocolo = novoProtocolo.getNumProtocolo();
		//cada valor nulo será considerado um protocolo vago
		if(qntProtocolo < 10) {
			Protocolo protocoloAchado = buscar(numProtocolo);
			if(protocoloAchado == null) {
				for(int i = 0; i < protocolo.length; i++) {
					if(protocolo[i] == null) {
						protocolo[i] = novoProtocolo;
						qntProtocolo++;
						break;
					}
				}
			}
		}	
	}
	
	/*
	 * Vai excluir um protocolo quando o numero de protocolo inserido
	 * for o mesmo que o protocolo encontrado.
	 * 
	 * Trasnforma o numero no vetor de array em Null.
	 */
	public void excluir(int numero) {
		
		for(int i = 0; i < protocolo.length; i++) {
			Protocolo atual = protocolo[i];
			if(atual != null) {
				int numProtocolo = atual.getNumProtocolo();
				if(numProtocolo == numero) {
					protocolo[i] = null;
					qntProtocolo--;
					break;
				}
			}
		}
	}
	
	
	
	/*
	 * Vai buscar um protocolo no array de protocolos, achando quando
	 * o numero de protocolo for o mesmo.
	 * 
	 * @return Retorna o protocolo ou nulo, caso não seja localizado o protocolo
	 */
	public Protocolo buscar(int numInserido) {
		
		Protocolo achado = null;
		
		for(int i = 0; i < protocolo.length; i++) {
			Protocolo atual = protocolo[i];
			if(atual != null) {
				int numeroAtual = atual.getNumProtocolo();
				if(numeroAtual == numInserido) {
					achado = atual;
				}
			}
		}
		return achado;
	}
	
}
