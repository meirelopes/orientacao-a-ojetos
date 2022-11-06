package capitulo11_3;

public class Main {
	public static void main(String[] args) {
		//Impressora i = new ImpressoraHp();
		
		// Só funciona se a interface tiver somente um método -> interface funcional
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: "+c);
		};
		
		
		Compra c = new Compra("Sabonete", 2.5);
		i.imprimir(c);
	}

}
