package capitulo11_4;

import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarFaturas();
		
		// Sem Stream
		/*for (Fatura fatura : faturas) {
			if(fatura.getValor()>250) {
				System.out.println("Alerta: Fatura acima de R$ 250,00 -> "+fatura);
			}
			
		}*/
		
		//Com Stream:
		
		Stream<Fatura> st = faturas.stream().filter(f -> f.getValor() > 250.00);
		st.forEach(f -> System.out.println(f));
		//Simplificando:
		System.out.println("***************************************");
		System.out.println("Simplificando:");
		faturas.stream().filter(f -> f.getValor() > 250.00)
		.forEach(f -> System.out.println(f));
		
		System.out.println("***************************************");
		faturas.forEach(f -> System.out.println(f));
		
	}

}
