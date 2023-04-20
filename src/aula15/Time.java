package aula15;

public class Time {
	
	private String nome;
	private String tecnico;
	private int pontos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}	
	public void pontuar() {
		this.pontos++;
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + this.pontos + " ponto(s)";
	}
}
