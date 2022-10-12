package capitulo3.exercicio3_14;

import capitulo3.exercicio3_6.Cachorro;

public class Pessoa {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	private Cachorro cachorro;

}
