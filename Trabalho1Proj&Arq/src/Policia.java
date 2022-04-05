
public class Policia implements Suporte{

	public void atende(int i) {
		if(i == 3)
			System.out.println("Atendimento com a Polícia!");
		else
			System.out.println("Código inválido!");
	}
}
