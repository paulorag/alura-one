
public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de video");
		return 150;
	}
}