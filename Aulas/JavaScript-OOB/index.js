import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente('Paulo', 11122233309);
const cliente2 = new Cliente("Byanca", 88822233309);

const contaCorrentePaulo = new ContaCorrente(cliente1, 1001);
contaCorrentePaulo.depositar(500);
const conta2 = new ContaCorrente(cliente2, 102);

let valor = 200;
contaCorrentePaulo.tranferir(valor, conta2);

console.log(ContaCorrente.numeroDeContas);