
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Roberto";
		paulo.cpf = "111.111.111-00";
		paulo.profissao = "Programador";

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
	}
}
