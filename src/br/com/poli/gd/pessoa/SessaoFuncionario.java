package br.com.poli.gd.pessoa;

public class SessaoFuncionario {
	
	public boolean validarCodigo(String codigo) {
		/*
		 * Verifica se as senhas de login inseridas
		 *pelo funcionario sao equivalentes aos tokens de login.
		 */
		
		if(codigo.equalsIgnoreCase("10768")|| codigo.equals("10679") 
			||codigo.equalsIgnoreCase("33635")) {
			return true;
		}else 
			return false;
	}
	
	/*
	 * Verifica o login do funcionario instansiado
	 * com o login inserido, de quem deseja logar.
	 */
	public boolean validaLogin(Funcionario log, String loginInserido) {
		if(log.getLogin().equals(loginInserido)) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * Verfica o login chamando a funcao de validar codigo
	 * se a funcao "validarcodigo" retorne true o login é validado
	 * caso não o login será atribuido como falso.
	 */
	
	public boolean loga(Funcionario log, String loginInserido, String codigo) {
		if (validaLogin(log, loginInserido)) {
			if (validarCodigo(codigo)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
