
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaByanca = new Conta();
		System.out.println(contaDaByanca.getSaldo());

		contaDaByanca.titular = new Cliente();
		System.out.println(contaDaByanca.titular);
		
		contaDaByanca.titular.nome = "Byanca";
		System.out.println(contaDaByanca.titular.nome);
	}
}
