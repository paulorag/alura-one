import { Cliente } from "./Cliente.js";
import { Gerente } from "./Funcionario/Gerente.js";
import { Diretor } from "./Funcionario/Diretor.js";
import { SistemaAutenticacao } from "./SistemaAutenticacao.js";

const diretor = new Diretor('Paulo', 10000, 12345678900);
diretor.cadastrarSenha('123456');
const gerente = new Gerente('Byanca', 5000, 12345674500);
gerente.cadastrarSenha('123');
const cliente = new Cliente('Aa', 123456789, '456');

const diretorEstaLogado = SistemaAutenticacao.login(diretor, '123456');
const gerenteEstaLogado = SistemaAutenticacao.login(gerente, '123');
const clienteEstaLogado = SistemaAutenticacao.login(cliente, '456');

console.log(gerenteEstaLogado, diretorEstaLogado, clienteEstaLogado);