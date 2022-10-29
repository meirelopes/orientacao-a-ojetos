package capitulo6_18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainOrdenandoPelaIdade {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("João", 22);
		Pessoa pessoa2 = new Pessoa("Adriana", 23);
		Pessoa pessoa3 = new Pessoa("Bruno", 21);
		
		List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3);
		IdadeComparator idadeComparator = new IdadeComparator();
		//Antes do java 8:
		//Collections.sort(pessoas, idadeComparator);
		
		//Depois do java8:
		pessoas.sort(idadeComparator);
		
		//Antes do java8:
		/*for (Pessoa p : pessoas) {
			System.out.println(p);
		}*/
		
		//Depois do java8:
		pessoas.forEach(System.out::println);

		
	}

}
