import { Cliente } from "./Cliente.js";
import { ContaCorrente } from "./Conta/ContaCorrente.js";
import { ContaPoupanca } from "./Conta/ContaPoupanca.js";
import { ContaSalario } from "./Conta/ContaSalario.js";

const cliente1 = new Cliente('Paulo', 11122233309);
const cliente2 = new Cliente('Byanca', 88822233309);


const contaCorrentePaulo = new ContaCorrente(cliente1, 1001);
contaCorrentePaulo.depositar(500);
contaCorrentePaulo.sacar(100);

console.log(contaCorrentePaulo);

const contaPoupancaByanca = new ContaPoupanca(50, cliente2, 1001);
contaPoupancaByanca.depositar(100);
contaPoupancaByanca.sacar(10);

console.log(contaPoupancaByanca);

const contaSalario = new ContaSalario(cliente1);
contaSalario.depositar(100);
contaSalario.sacar(10);

console.log(contaSalario);