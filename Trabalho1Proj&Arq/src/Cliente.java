
public class Cliente {
	private String nome;
	private Veiculo veiculo;
	private Vaga vaga;
	public Cliente proximo;
	
	public Cliente(String nome, Veiculo veiculo, Vaga vaga) {
		this.nome = nome;
		this.veiculo = veiculo;
		this.vaga = vaga;
		this.proximo = null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	
}
