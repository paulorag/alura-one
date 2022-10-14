class Cliente {
    nome;
    cpf;
    rg;
}

class ContaCorrente {
    agencia;
    _saldo = 0;

    sacar(valor) {
        if (this._saldo >= valor) {
            this._saldo -= valor;
            return valor;
        }
    }

    depositar(valor) {
        if (valor <= 0) {
            return;
        }
        this._saldo += valor;
    }
}

const cliente1 = new Cliente();
cliente1.nome = 'Paulo';
cliente1.cpf = 11122233309;
cliente1.rg = 123456789;

const cliente2 = new Cliente();
cliente2.nome = 'Byanca';
cliente2.cpf = 33322211109;
cliente2.rg = 0;

const contaCorrentePaulo = new ContaCorrente();
contaCorrentePaulo.agencia = 1001;

contaCorrentePaulo.depositar(100);
contaCorrentePaulo.depositar(100);
contaCorrentePaulo.depositar(100);

const valorSacado = contaCorrentePaulo.sacar(50);
console.log(valorSacado);

console.log(contaCorrentePaulo);