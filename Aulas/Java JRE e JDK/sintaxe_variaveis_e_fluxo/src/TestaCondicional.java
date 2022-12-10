
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Seja Bem-Vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de idade, mas está acompanhado" + " pode entrar");
			} else {
				System.out.println("Você é menor de idade");
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
