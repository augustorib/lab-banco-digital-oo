import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void criarContaNoBanco(Conta conta){this.contas.add(conta);}

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
