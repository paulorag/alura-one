
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 25226);
		Conta conta3 = new Conta(1337, 25526);
		
		System.out.println(Conta.getTotal());
	}
}