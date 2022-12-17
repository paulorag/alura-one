
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaByanca = new Conta();
		contaDaByanca.deposita(1000);

		boolean sucessoTransferencia = contaDaByanca.transfere(300, contaDoPaulo);

		if (sucessoTransferencia) {
			System.out.println("Transferencia realizada");
		} else {
			System.out.println("Transferencia não realizada");
		}

		System.out.println(contaDaByanca.saldo);
		System.out.println(contaDoPaulo.saldo);

		contaDoPaulo.titular = "Paulo Roberto";
		System.out.println(contaDoPaulo.titular);
	}
}
