package br.com.poli.gd.pessoa;

import java.util.InputMismatchException;;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String endereco;
	private String numTelefone;
	private String email;

	/*
	 * construtor que será utilizado para criar um aluno pois, no aluno erá
	 * necessario ter todos os dados atribuidos a uma pessoa.
	 */
	public Pessoa(String cpf , String nome, String endereco, String numTelefone, String email) {
		setCPF(cpf);
		setNome(nome);
		setEndereco(endereco);
		setEmail(email);
		setNumTelefone(numTelefone);
	}

	/*
	 * construtor utilizado para funcionario, pois o funcionario só utilizará o CPF
	 * para realizar o seu login, os outros dados são irrelevantes.
	 */
	public Pessoa(String cpf) {
		setCPF(cpf);
	}

	public boolean isCpf(String CPF) {

		// caso o usuario informe o cpf com outros caracteres além dos números, eles
		// serão apagados, para fins do calculo.
		CPF = CPF.replace(".", "");
		CPF = CPF.replace("-", "");

		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11; // Os digitos achados serão armazenados nessas variaveis, para comparações
							// futuras.
		int soma, resto, num, peso;

		try {
			// Calculo do 1o. Digito Verificador
			soma = 0;
			peso = 10;
			for (int i = 0; i < 9; i++) {
				/*
				 * Converte o caractere, na posicao i, da String em um numero. '0' -> (int)0. é
				 * diminuido 48 pois equivale ao valor do '0' na tabela Ascii.
				 */
				num = (int) (CPF.charAt(i) - 48);
				soma = soma + (num * peso);
				peso = peso - 1;
			}

			resto = 11 - (soma % 11); // expressão para calculo do dig verificador.

			if ((resto == 10) || (resto == 11))
				dig10 = '0';
			else
				dig10 = (char) (resto + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			soma = 0;
			peso = 11;
			for (int i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				soma = soma + (num * peso);
				peso = peso - 1;
			}

			resto = 11 - (soma % 11);
			if ((resto == 10) || (resto == 11))
				dig11 = '0';
			else
				dig11 = (char) (resto + 48);

			/*
			 * como dito anteriormente os dig10 e dig11 serião verificados com os do cpf
			 * informado, para verificar a validade
			 */
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}

}
