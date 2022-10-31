package capitulo7_10;

public class ReplaceString {

	public static void main(String[] args) {
		String texto = "O valor do produto é R$ @xxx@.";
		String novoTexto1 = texto.replaceAll("@x@", "2,50");
		String novoTexto2 = texto.replaceAll("@x+@", "2,50");

		System.out.println(novoTexto1);
		System.out.println("--------------------------------");
		System.out.println(novoTexto2);
		
		

	}

}
