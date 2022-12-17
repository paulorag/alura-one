
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Roberto");
		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");

		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
