package capitulo11_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class DevolucaoCarro {
	public static void main(String[] args) {
		
		Aluguel aluguel = recuperarAluguel();
		
		LocalDateTime dataHoraRealDevolucao = LocalDateTime.of(LocalDate.now().plusDays(1)
				, LocalTime.now());
		aluguel.setDataHoraRealDevolucao(dataHoraRealDevolucao);
		aluguel.imprimeFatura();
	}
	

	private static Aluguel recuperarAluguel() {
		
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro =new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataHoraRetirada = LocalDateTime.of(LocalDate.now()
				, LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataHoraPrevistaDevolucao =
				LocalDateTime.now().plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataHoraRetirada, dataHoraPrevistaDevolucao);

		return aluguel; 

	}
	}