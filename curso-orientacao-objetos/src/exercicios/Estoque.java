package exercicios;

public class Estoque {
    Produto[] produtos;
    
    public void listarProdutos() {
		System.out.println("LISTA DE PRODUTOS:");
		System.out.println("-----------------------");
    	for (int i = 0; i < produtos.length; i++) {
    		produtos[i].descrever();
		}
    }


}
