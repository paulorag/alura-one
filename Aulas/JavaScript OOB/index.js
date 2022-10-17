import { Cliente } from "./cliente";
import { ContaCorrente } from "./ContaCorrente";

const cliente1 = new Cliente();
cliente1.nome = 'Paulo';
cliente1.cpf = 11122233309;

const cliente2 = new Cliente();
cliente2.nome = 'Byanca';
cliente2.cpf = 33322211109;

const contaCorrentePaulo = new ContaCorrente();
contaCorrentePaulo.agencia = 1001;

contaCorrentePaulo.depositar(100);
contaCorrentePaulo.depositar(100);
contaCorrentePaulo.depositar(100);

const valorSacado = contaCorrentePaulo.sacar(50);
console.log(valorSacado);

console.log(contaCorrentePaulo);