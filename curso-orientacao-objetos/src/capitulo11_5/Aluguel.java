package capitulo11_5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {
	
	private Cliente cliente;
	private Carro carro;
	private LocalDateTime dataHoraRetirada;
	private LocalDateTime dataHoraPrevistaDevolucao;
	private LocalDateTime dataHoraRealDevolucao;
	
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataHoraRetirada,
			LocalDateTime dataHoraPrevistaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataHoraRetirada = dataHoraRetirada;
		this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalDateTime getDataHoraRetirada() {
		return dataHoraRetirada;
	}
	public void setDataHoraRetirada(LocalDateTime dataHoraRetirada) {
		this.dataHoraRetirada = dataHoraRetirada;
	}
	public LocalDateTime getDataHoraPrevistaDevolucao() {
		return dataHoraPrevistaDevolucao;
	}
	public void setDataHoraPrevistaDevolucao(LocalDateTime dataHoraPrevistaDevolucao) {
		this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
	}
	public LocalDateTime getDataHoraRealDevolucao() {
		return dataHoraRealDevolucao;
	}
	public void setDataHoraRealDevolucao(LocalDateTime dataHoraRealDevolucao) {
		this.dataHoraRealDevolucao = dataHoraRealDevolucao;
	}
	public void imprimeFatura() {
		Duration duration = Duration.between(dataHoraPrevistaDevolucao, dataHoraRealDevolucao);
		System.out.println(">>>>>>>>>FATURA<<<<<<<<<");
		if(!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria()*0.1;
			System.out.printf("Valor da multa: R$ %.2f. Pois você atrasou %s horas.",multa,duration.toHours());
		} else {
			System.out.println("Obrigado. Você foi pontual!");
		}
}

	
	

}
