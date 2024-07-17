import java.util.Scanner;

public class AtendimentoEletronico {

    Banco banco = new Banco();

    public void escolherOpcao()
    {
        System.out.println("Bem vindo ao Atendimento Eletrônico!!! \nEscolha uma das opções a seguir: ");
        System.out.println("1 - Criar conta ");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro para uma conta");
        System.out.println("5 - Sair");

    }

    public void criarContaAtendimentoEletronico()
    {
        System.out.println("Digite o nome do titular: ");
        Scanner in = new Scanner(System.in);

        String nome = in.next();

        Cliente cliente = new Cliente(nome);

        escolherTipoConta(cliente);
        System.out.println();

    }

    public void escolherTipoConta(Cliente cliente)
    {
        System.out.println("Digite o número para escolher o tipo de conta: ");
        System.out.println("1 - Conta Corrente ");
        System.out.println("2 - Conta Poupança ");

        Scanner in = new Scanner(System.in);
        int tipoConta = in.nextInt();

        Conta conta;

        if(tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        }
        else {
             conta = new ContaPoupanca(cliente);
        }

        banco.adicionarContaNoBanco(conta);
    }

    public void depositarDinheiroNoCaixa()
    {
        System.out.println("Informe o número da conta: ");
        Scanner in = new Scanner(System.in);

        int numeroConta = in.nextInt();

        Conta conta = banco.getContaByNumero(numeroConta);

        System.out.println("Informar a quantia para deposito: ");
        int deposito = in.nextInt();

        conta.depositar(deposito);
        System.out.println();
        conta.imprimirExtrato();
        System.out.println();
    }

    public void sacarDinheiroNoCaixa()
    {
        System.out.println("Informe o número da conta: ");
        Scanner in = new Scanner(System.in);

        int numeroConta = in.nextInt();

        Conta conta = banco.getContaByNumero(numeroConta);

        System.out.println("Informar a quantia para saque: ");
        int saque = in.nextInt();

        conta.sacar(saque);
        System.out.println();
        conta.imprimirExtrato();
        System.out.println();
    }

}

