import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./ContaCorrente.js";

const cliente1 = new Cliente('Paulo', 11122233309);
const cliente2 = new Cliente('Byanca', 88822233309);


const contaCorrentePaulo = new ContaCorrente(1001, cliente1);
contaCorrentePaulo.depositar(500);
contaCorrentePaulo.sacar(100);

const conta2 = new ContaCorrente(102, cliente2);

let valor = 200;
contaCorrentePaulo.tranferir(valor, conta2);

console.log(contaCorrentePaulo);