import java.util.Scanner;

public class Facade {
	 public BancoDeDados banco;
	 
	 public Facade() {
		this.banco = new BancoDeDados();
	}

	Scanner prompt = new Scanner(System.in);
	 
	 public void create() {
		 BuilderCliente builder = new BuilderCliente();
		 Cliente cliente = builder.createCliente();
		 
		 banco.add(cliente);
	 }
	 
	 public void read(String index) {
		 Cliente cliente = banco.getByName(index);
		 if(cliente != null) {
			 System.out.println("NOME: " + cliente.getNome());
			 System.out.println("VEÍCULO: " + cliente.getVeiculo().getTipo() + " || PLACA: " + cliente.getVeiculo().getPlaca());
			 System.out.println("VAGA: " + cliente.getVaga().getCode() + " || TEMPO: " + cliente.getVaga().getTime() + " || VALOR: R$" + cliente.getVaga().getValor());
		 } else {
			 System.out.println("Cliente não encontrado!");
		 }
	}
	 
	 public void update(String index) {
		 Cliente cliente = banco.getByName(index);

		 System.out.println("Nome: " + cliente.getNome());
		 System.out.println("Placa do veículo: " + cliente.getVeiculo().getPlaca());
		 System.out.println("Qual o novo nome?");
		 String nome = prompt.next();
		 cliente.setNome(nome);
		 System.out.println("Nome alterado com sucesso!");
	 }
	 
	 public void delete(String index) {
		Cliente cliente = banco.primeiro;
		if(banco.primeiro == null) {
			System.out.println("Nenhum cliente cadastrado!");
		} else {
			while(cliente.proximo != null && !cliente.proximo.getNome().toUpperCase().equals(index.toUpperCase())) {
				cliente = cliente.proximo; 
			}
			if(cliente.proximo.getNome().toUpperCase().equals(index.toUpperCase())) {
				cliente.proximo = cliente.proximo.proximo;
			} else {
				System.out.println("Cliente não encontrado");
			}
		}
	 }
	 
	 public void showAll() {
		 if(banco.primeiro == null) {
			 System.out.println("Nenhum cliente cadastrado!");
		 } else {
			 Cliente cliente = banco.primeiro;
			 while(cliente != null) { 
				System.out.println("NOME: " + cliente.getNome());
				System.out.println("VEÍCULO: " + cliente.getVeiculo().getTipo() + " || PLACA: " + cliente.getVeiculo().getPlaca());
				System.out.println("VAGA: " + cliente.getVaga().getCode() + " || TEMPO: " + cliente.getVaga().getTime() + " || VALOR: R$" + cliente.getVaga().getValor());
				System.out.println("");
				cliente = cliente.proximo;
			}
		 }
	 }
}






