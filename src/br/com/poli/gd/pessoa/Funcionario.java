package br.com.poli.gd.pessoa;

import br.com.poli.gd.protocolos.*;
/*
 * O funcionário poderá alterar o status dos protocolos
 */

public class Funcionario extends Pessoa {

	private String login;
	private String codigoAcesso;

	public Funcionario(String cpf) {
		super(cpf);

		this.login = getCPF();
	}

	/*
	 * Funcionario vai receber um protocolo e dependendo do que for selecionado vai
	 * poder criar um determindo tipo de protocolo.
	 */
	/*
	 * OBSERVAÇÃO código comentado, por motivo de futuramente seu uso ser realocado
	 * para a interface, no momento em que for feito o cadastro do protocolo no
	 * programa
	 */

	/*
	 * public Protocolo criaProtocolo(int i, Protocolo protocolo, Aluno aluno) {
	 * 
	 * switch (i) { case 1: protocolo = new DispensaDisciplina("Calculo 2", "BM",
	 * aluno); break; case 2: protocolo = new Desligamento(aluno); break; case 3:
	 * protocolo = new SegundaChamada("BM", "Calculo 2", aluno); break; case 4:
	 * protocolo = new TransferExterna("UPE", "UFPE", aluno); break; case 5:
	 * protocolo = new TransferInterna("Engenharia da computacao", aluno); default:
	 * protocolo = null; break; }
	 * 
	 * return protocolo; }
	 */

	/*
	 * Vai permitir o funcionario alterar o status do protocolo
	 */
	public boolean alteraStatus() {
		boolean mudaStatus = false;
		short opcao = 0;

		do {

			switch (opcao) {
			case 1:
				mudaStatus = false;
				break;
			case 2:
				mudaStatus = true;
				break;
			default:
				System.out.println("Opcao invalida");

			}

		} while (opcao != 1 || opcao != 2);

		return mudaStatus; // retorna o status do que será aplicado ao protocolo
	}

	/*
	 * Faz o login do funcionario, verica a senha com a funcao logar e retorna a
	 * sessão de login ao usuario.
	 * 
	 * Caso a senha seja falsa será retornada uma sessão nula.
	 */
	public SessaoFuncionario loga(Funcionario log, String loginInserido, String senha) {
		SessaoFuncionario entrou = new SessaoFuncionario();
		if (entrou.loga(log, loginInserido, senha)) {
			return entrou;
		} else {
			return entrou = null;
		}

	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
