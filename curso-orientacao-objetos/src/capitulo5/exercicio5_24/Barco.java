package capitulo5.exercicio5_24;

public class Barco implements Seguravel {
	private double valorMercado;
	private int anoFabricacao;
	

	public Barco(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	public double calcularValorDaApolice() {
		double valorDaApolice = 0.20*this.valorMercado;
		if(this.anoFabricacao<2010) {
			valorDaApolice = valorDaApolice*0.95;
		}
		return valorDaApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano de fabricação: "
	+this.anoFabricacao+"\nValor de mercado: "+this.valorMercado;
	}

}
