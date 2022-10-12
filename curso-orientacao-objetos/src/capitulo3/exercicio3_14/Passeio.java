package capitulo3.exercicio3_14;

import capitulo3.exercicio3_6.Cachorro;

public class Passeio {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Juce");
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Nacho");
		pessoa1.setCachorro(cachorro);
		Caminhada caminhada1 = new Caminhada();
		caminhada1.andar(pessoa1);
		
		

	}

}
