
public class Gerente implements Suporte{
	private Policia sucessor = new Policia();

	public void atende(int i) {
		if(i == 2)
			System.out.println("Atendimento com o Gerente!");
		
		sucessor.atende(i);
	}
}
