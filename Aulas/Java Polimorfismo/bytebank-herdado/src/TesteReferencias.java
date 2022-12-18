
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Paulo");
		g.setSalario(5000);

		Funcionario f = new Funcionario();
		f.setSalario(2000);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(f);
		controle.registra(ev);

		System.out.println(controle.getSoma());
	}
}
