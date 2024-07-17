import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();

	public void adicionarContaNoBanco(Conta conta){this.contas.add(conta);}

	public Conta getContaByNumero(int numeroConta)
	{
		for(Conta conta : contas)
		{
			if(conta.getNumero() == numeroConta)
				return conta;
		}

		return null;
	}

	public void listarContas()
	{
		System.out.println("==== Contas existentes no Banco =======");
		for(Conta conta : this.contas )
		{
			System.out.println("Dono da Conta: " + conta.getCliente().getNome());
			System.out.println("Agência: " + conta.getAgencia());
			System.out.println("Número da conta: " + conta.getNumero());
			System.out.println("------------------------------------------");
		}
	}
}
