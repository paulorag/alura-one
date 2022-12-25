
public class TesteFuncionario {
	public static void main(String[] args) {

		Gerente paulo = new Gerente();
		paulo.setNome("Paulo");
		paulo.setCpf("111.222.333-44");
		paulo.setSalario(2600);

		System.out.println(paulo.getNome());
		System.out.println(paulo.getBonificacao());
	}
}
