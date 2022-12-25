
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Paulo");
		g.setSalario(5000);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);

		Designer d = new Designer();
		d.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}
}
