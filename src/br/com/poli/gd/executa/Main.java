package br.com.poli.gd.executa;

import java.sql.SQLException;

import br.com.poli.gd.bancoDados.*;
import br.com.poli.gd.pessoa.Aluno;
import br.com.poli.gd.pessoa.Funcionario;
import br.com.poli.gd.protocolos.DispensaDisciplina;
import br.com.poli.gd.protocolos.Protocolo;
import br.com.poli.gd.protocolos.RepositorioProtocolos;
public class Main {
	
	/*
	 * Classe existente apenas para testes
	 */

	public static void main(String[] args) throws SQLException {
				
				Aluno a1 = new Aluno(null, null, "70447872400", null, null, null);
				System.out.println(a1.isCpf(a1.getCPF()));
				
				Protocolo p1 = new DispensaDisciplina("abacate", "GM", a1);
				Funcionario f1 = new Funcionario("70447872400");
				
				
				System.out.println("\n teste \n");
				//p1 = f1.criaProtocolo(1, p1, a1); Função comentada por motivo explicado em sua assinatura (br.com.poli.gp.pessoa.Funcioario)
				System.out.println(p1.getClass());
				
				System.out.println(p1.toString());
				
				RepositorioProtocolos b1 = new RepositorioProtocolos();
				System.out.println("\n teste 2 \n");
				
				b1.addProtocolo(p1);
				
				Protocolo p2 = new Protocolo(a1);
				p2 = b1.buscar(p1.getNumProtocolo());
				
				System.out.println("\n teste 3 \n");
				System.out.println(p2.toString());
				
				System.out.println("\n Teste 4 \n");
				System.out.println(p2.getNumProtocolo());
				
		
	
		
	}	
}


/*
 * Alterações no código:
 * 1-	Adicionado um Setter e getter aos atributos status e preco.
 * 2-	Criado os métodos que imprimem a parte relacionado ao protocolo específico
 * 3-	Começada o metodo, na main, que irá executar o código (lembrar de retirar da main e por em 
 * um método a parte apenas para ser chamado na main). 
 * 
 * 0.2
 * 1- Corrigido o erro que estava no constructor da classe segunda chamada
 * 2- Algumas arrumações bestas foram feitas, como colocar um valor aleatório no preço 
 * dos requerimentos.

 * 0.3 - 
 * 1-	Criação das classes Desligamento, TransferExterna, TransferInterna, de seus métodos e atributos
 * 2- 	Agora o programa ja imprime os dados do usuário
 * 3-	Arrumação de erros bestinhas do código e foram adicionados comentários para melhor entendimento do código.

 * 0.4 - 
 *		Adicionado corpo aos métodos da classe transferência externa e interna
 
 * 0.5 -
 * 1- 	Criação dos métodos 'dizer', que servem para pedir informações ao usuario	
 * 2- 	retirada de todos os parametros dos contructors e implementação dos métodos dizer
 *para que assim seja possivel o usuário inserir seus próprios dados.
 * 3- 	implementação do metodo que imprime os dados do usuário nas classes: TransferExterna, TransferInterna, Desligamento.		
 *
 * 0.6 -
 * 1-	Reformulação estrutural no código.
 * 2-	Criação da classe aluno com os seus dados
 * 3- 	Mudança na classe protocolo básico, que virou Protocolo
 * 4- 	Mudança na estrutura da herança
 * 5- 	Criação do pacote Pessoa
 * 
 * 0.9 - 
 * 1- Criada classe Pessoa. A classe aluno, agora, herda de psoa
 * 2- Criado o algotimo para tirar um aluno do array
 */
	
