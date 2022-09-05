
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel funcAut) {
		
		boolean autenticou = funcAut.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Pode entrar no sistema");
		}
	}
}
