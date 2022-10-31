package capitulo7_10;


public class SplitSpring {

	public static void main(String[] args) {
		String texto1 = "O Java é uma linguagem orientada a objetos.";
		
		String[] palavras1 = texto1.split(" ");
		for (String palavra : palavras1) {
			System.out.println(palavra);
		}

		System.out.println("------------------------------------------");
		String texto2 = "O4Java1é3uma9linguagem9orientada1a8objetos.";
		
		String[] palavras2 = texto2.split("\\d");
		for (String palavra : palavras2) {
			System.out.println(palavra);
		}

		
	}

}
