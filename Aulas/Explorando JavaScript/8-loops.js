console.log('\nTrabalhando com condionais');

const listaDeDestinos = ['São Paulo', 'Salvador', 'Rio de Janeiro'];

const idadeComprador = 17;
const estaAcompanhado = false;
let temPassagemComprada = false;
const destino = 'Salvador';

console.log('\n Destinos Possiveis');
console.log(listaDeDestinos);

const podeComprar = idadeComprador >= 18 || estaAcompanhado == true;

let contador = 0;
let destinoExiste = false;
while (contador < listaDeDestinos.length) {
    if (listaDeDestinos[contador] == destino) {
        console.log('Destino existe');
        destinoExiste = true;
        break;
    }
    contador += 1;
}

console.log('Seu destino existe: ', destinoExiste);

if (podeComprar && destinoExiste) {
    console.log('Boa Viagem!');
} else {
    console.log('Desculpe tivemos um erro!');
}

for (let i = 0; i < listaDeDestinos.length; i++) {
    if (listaDeDestinos[i] == destino) {
        console.log('Destino existe');
        destinoExiste = true;
    }
}
