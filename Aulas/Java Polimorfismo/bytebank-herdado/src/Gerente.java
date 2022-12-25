
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario();
	}

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
