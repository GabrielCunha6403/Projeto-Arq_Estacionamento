import java.util.Scanner;

public class BuilderCliente {
	
	Scanner prompt = new Scanner(System.in);
	
	public Cliente createCliente() {
		System.out.println("Qual o nome do Cliente?");
		String nome = prompt.next();
		
		return new Cliente(nome, createVeiculo(), createVaga());
		
	}
	
	public Vaga createVaga() {
		System.out.println("Qual o c�digo da Vaga?");
		String cod = prompt.next();
		System.out.println("Quanto tempo j� se passou vaga?");
		String tempo = prompt.next();
		System.out.println("Qual valor acumulado?");
		double valor = prompt.nextDouble();
		
		return new Vaga(cod, tempo, valor);
		
	}
	
	public Veiculo createVeiculo() {
		System.out.println("Qual placa do Ve�culo?");
		String placa = prompt.next();
		System.out.println("Qual o tipo do Ve�culo?");
		String tipo= prompt.next();
		
		return new Veiculo(placa, tipo);
		
	}
}
