import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Cliente venilton = new Cliente();
//		venilton.setNome("Venilton");
//
//		Cliente jurandir = new Cliente();
//		jurandir.setNome("Jurandir Antônio");
//
//		Cliente judit = new Cliente();
//		judit.setNome("Judit da Silva");
//
//		Conta cc = new ContaCorrente(venilton);
//		Conta poupanca = new ContaPoupanca(venilton);
//		Conta contaCorrente2 = new ContaCorrente(jurandir);
//		Conta poupanca2 = new ContaPoupanca(judit);
//
//		cc.depositar(100);
//		cc.transferir(100, poupanca);
//
//		contaCorrente2.depositar(1000);
//
//		poupanca2.depositar(2000);
//		poupanca2.transferir(200, contaCorrente2);
//
//
//		Banco bancoNacional = new Banco();
//
//		bancoNacional.criarContaNoBanco(cc);
//		bancoNacional.criarContaNoBanco(contaCorrente2);
//		bancoNacional.criarContaNoBanco(poupanca);
//		bancoNacional.criarContaNoBanco(poupanca2);
//
//		bancoNacional.listarContas();
//
//		contaCorrente2.imprimirExtrato();
//		poupanca2.imprimirExtrato();



		boolean continuarAtendimento = true;

		AtendimentoEletronico caixa = new AtendimentoEletronico();

		while(continuarAtendimento)
		{

			caixa.escolherOpcao();

			Scanner in = new Scanner(System.in);
			int opcaoMenu = in.nextInt();

			 switch(opcaoMenu)
			 {
				 case 1:
					 caixa.criarContaAtendimentoEletronico();
					 break;
				 case 2:
					 caixa.depositarDinheiroNoCaixa();
					 break;
				 case 3:
					 caixa.sacarDinheiroNoCaixa();
					 break;
				 case 4:
					 continuarAtendimento = false;
					 break;
				 default:
					 System.out.println("Nenhuma opção válida foi escolhida. Tente novamente");
					 break;
			 }
		}

		System.out.println("Atendimento encerrado, obrigado volte sempre!!!");
	}

}
