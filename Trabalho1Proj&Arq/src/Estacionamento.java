import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {

		Scanner prompt = new Scanner(System.in);
		boolean operacao = true;
		int select;
		Seguranca suporte = new Seguranca();
		String nome;
		
		Facade f = new Facade();
		
		while(operacao) {
			System.out.println("SELECIONE UMA OPERAÇÃO:");
			System.out.println("1- Cadastrar um cliente;");
			System.out.println("2- Ver dados de um cliente;");
			System.out.println("3- Ver todos os clientes;");
			System.out.println("4- Mudar nome de um cliente;");
			System.out.println("5- Deletar cliente;");
			System.out.println("6- Suporte;");
			System.out.println("7- Sair;");
			select = prompt.nextInt();
			
			switch(select){
				case 1:
					f.create();
				break;
				
				case 2:
					System.out.println("Digite um nome para fazer uma busca:");
					nome = prompt.next();
					f.read(nome);
				break;
				
				case 3:
					f.showAll();
				break;
				
				case 4:
					System.out.println("Digite um nome para fazer uma busca e alterar o nome:");
					nome = prompt.next();
					f.update(nome);
				break;
				
				case 5:
					System.out.println("Digite um nome para fazer uma busca e deletar:");
					nome = prompt.next();
					f.delete(nome);
				break;
				
				case 6:
					System.out.println("Qual suporte precisa?");
					System.out.println("1- Segurança;");
					System.out.println("2- Gerente;");
					System.out.println("3- Polícia;");
					int op = prompt.nextInt();
					suporte.atende(op);
				break;
				
				case 7:
					operacao = false;
				break;
			}
		}
		
	}

}
