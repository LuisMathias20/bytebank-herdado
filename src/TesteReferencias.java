
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Carlos");
//		f1.setSalario(2000.0);
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("Jessica");
		e1.setSalario(3000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
//		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
	}

}
