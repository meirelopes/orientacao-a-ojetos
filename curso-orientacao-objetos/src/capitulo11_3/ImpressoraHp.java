package capitulo11_3;

public class ImpressoraHp implements Impressora{

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando o comando para a impressora HP -> "+c);
		
	}

}
