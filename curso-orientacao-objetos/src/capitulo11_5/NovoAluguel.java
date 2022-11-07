package capitulo11_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro =new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataHoraRetirada = LocalDateTime.of(LocalDate.now()
				, LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataHoraPrevistaDevolucao =
				LocalDateTime.now().plusDays(3).plusHours(2);

		
		Aluguel aluguel = new Aluguel(cliente, carro, dataHoraRetirada, dataHoraPrevistaDevolucao);
		imprimirRecibo(aluguel);

	}

	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println(">>>>>>>>>>>>>>>>RECIBO<<<<<<<<<<<<<<<");
		System.out.println("Carro: "+aluguel.getCarro().getModelo());
		System.out.println("Cliente: "+aluguel.getCliente().getNome());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora da retirada: "+aluguel.getDataHoraRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolução: "+aluguel.getDataHoraPrevistaDevolucao().format(formatter));
	}

}
