
public class Seguranca implements Suporte{
	private Gerente sucessor = new Gerente();
	
	public void atende(int i) {
		if(i == 1)
			System.out.println("Atendimento com o Segurança!");
		
		sucessor.atende(i);
	}
}
