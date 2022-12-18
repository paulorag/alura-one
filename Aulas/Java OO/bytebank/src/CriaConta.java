
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("primeira conta tem: R$" + primeiraConta.saldo);
		System.out.println("segunda conta tem: R$" + segundaConta.saldo);

		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
