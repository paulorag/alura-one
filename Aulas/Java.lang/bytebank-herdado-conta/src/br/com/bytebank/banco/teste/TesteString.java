package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String vazio = " Paulo ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Paul"));
		System.out.println(outroVazio);

		int a = 3;
		String nome = "Paulo";
		// String outro = new String("Paulo");

		// char c = nome.charAt(2);
		// System.out.println(c);

		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		// String sub = nome.substring(1);
		// System.out.println(sub);

		// int pos = nome.indexOf("ul");
		// System.out.println(pos);

		// char c = 'P';
		// char d = 'p';
		// String outra = nome.replace(c, d);

		// String outra = nome.toUpperCase();

		// System.out.println(nome);
		// System.out.println(outra);
	}

}
