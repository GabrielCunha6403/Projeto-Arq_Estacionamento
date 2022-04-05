
public class BancoDeDados {
	public Cliente primeiro;
	public Cliente proximo;

	public void add(Cliente cliente) {
		if(primeiro == null) {
			primeiro = cliente;
		} else {
			Cliente aux = primeiro;
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = cliente;
		}
	}
	
	public Cliente getByName(String nome) {
		if(primeiro == null) {
			System.out.println("Nenhum cliente cadastrado!");
			return null;
		} else {
			Cliente aux = primeiro;
			if(nome.toUpperCase().equals(aux.getNome().toUpperCase())) {
				return primeiro;
			} else {
				while(aux != null && !nome.toUpperCase().equals(aux.getNome().toUpperCase())) {
					aux = aux.proximo;
				}
				if(aux == null) {
					System.out.println("Cliente não cadastrado!");
					return null;
				} else {
					return aux;
				}
			}
		}
	}
}
