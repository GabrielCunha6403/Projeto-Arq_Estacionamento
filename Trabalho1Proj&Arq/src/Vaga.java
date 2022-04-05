
public class Vaga {
	private String cod;
	private String tempo;
	private double valor;
	
	public Vaga(String cod, String tempo, double valor) {
		this.cod = cod;
		this.tempo = tempo;
		this.valor = valor;
	}
	public String getCode() {
		return cod;
	}
	public void setCode(String cod) {
		this.cod = cod;
	}
	public String getTime() {
		return tempo;
	}
	public void setTime(String tempo) {
		this.tempo = tempo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
