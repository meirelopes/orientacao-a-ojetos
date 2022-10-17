package capitulo5.exercicio5_24;

public class Notebook implements Seguravel{
	
	private double valorMercado;
	
	
	
	public Notebook(double valorMercado) {
		super();
		this.valorMercado = valorMercado;
	}

	@Override
	public double calcularValorDaApolice() {
		double valorApolice = valorMercado*0.3;
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook com valor de mercado de R$ "+this.valorMercado;
	}

}
