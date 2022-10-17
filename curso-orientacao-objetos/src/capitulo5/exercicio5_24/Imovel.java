package capitulo5.exercicio5_24;

public class Imovel implements Seguravel{
	
	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		super();
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}


	@Override
	public double calcularValorDaApolice() {
		double valorApolice = this.valorMercado*0.003;
		valorApolice = valorApolice+(this.areaConstruida*0.5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Imóvel com área construída de : "
	+this.areaConstruida+"m² e valor de mercado de "+this.valorMercado;
	}

}
