package capitulo11_5;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class CadastroCarro {
	
	public static void main(String[] args) {
		Carro gol = new Carro("Gol", 90.00, Year.of(2012));
		Carro cruze = new Carro("Cruze", 200.00, Year.parse("2013"));
		Carro celta = new Carro("Celta", 80.00, Year.of(2011));
		
		List<Carro> carros = Arrays.asList(gol, cruze, celta);
		carros.stream().filter(c -> c.getAno().isAfter(Year.of(2012)))
		.forEach(c -> System.out.println( c.getModelo()));
				

	}

}
