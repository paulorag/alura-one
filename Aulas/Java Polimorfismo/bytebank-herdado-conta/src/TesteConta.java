
public class TesteConta {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);

		cc.transfere(10, cp);

		System.out.println("CC R$" + cc.getSaldo());
		System.out.println("CP R$" + cp.getSaldo());
	}
}
