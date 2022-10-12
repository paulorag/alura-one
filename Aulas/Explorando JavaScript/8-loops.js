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

while (contador < listaDeDestinos.length){
    console.log(listaDeDestinos[contador]);
    break;
}

console.log('Embarque: \n\n');
if ((idadeComprador >= 18 || estaAcompanhado == true) && temPassagemComprada == true) {
    console.log('Boa Viagem');
} else {
    console.log('Você não pode embarcar');
}
