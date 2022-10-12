console.log('Trabalhando com condionais');

const listaDeDestinos = ['São Paulo', 'Salvador', 'Rio de Janeiro'];

const idadeComprador = 17;
const estaAcompanhado = false;
const temPassagemComprada = true;

console.log('Destinos Possiveis');
console.log(listaDeDestinos);

// if (idadeComprador >= 18) {
//     console.log('Comprador maior de idade');
//     listaDeDestinos.splice(1, 1);
//     console.log(listaDeDestinos);
// } else if (estaAcompanhado == true) {
//     console.log('Está acompanhado e pode comprar');
//     listaDeDestinos.splice(1, 1);
//     console.log(listaDeDestinos);
// } else {
//     console.log('Comprador é menor de idade e não está acompanhado');
//     console.log(listaDeDestinos);
// }

if (idadeComprador >= 18 || estaAcompanhado == true) {
    console.log('Pode comprar');
    listaDeDestinos.splice(1, 1);
    console.log(listaDeDestinos);
} else {
    console.log('Comprador é menor de idade e não está acompanhado');
    console.log(listaDeDestinos);
}

console.log('Embarque: \n\n');
if ((idadeComprador >= 18 || estaAcompanhado == true) && temPassagemComprada == true) {
    console.log('Boa Viagem');
} else {
    console.log('Você não pode embarcar');
}

// console.log(idadeComprador > 18);
// console.log(idadeComprador < 18);
// console.log(idadeComprador <= 18);
// console.log(idadeComprador >= 18);
// console.log(idadeComprador == 18);
// console.log(idadeComprador != 18);