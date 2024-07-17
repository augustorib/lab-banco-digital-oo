import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

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
					 caixa.transferirDinheiroNoCaixa();
					 break;
				 case 5:
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
