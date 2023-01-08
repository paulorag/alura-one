package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Object[] referencia = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;

		ContaPoupanca cp1 = new ContaPoupanca(22, 22);
		referencia[1] = cp1;

		Cliente cliente = new Cliente();
		referencia[2] = cliente;

		//Object referenciaGenerica = contas[1];
		
		//System.out.println(contas[1].getNumero());

		ContaCorrente ref = (ContaCorrente) referencia[1];

		System.out.println(cp1.getNumero());
		System.out.println(ref.getNumero());

	}

}
