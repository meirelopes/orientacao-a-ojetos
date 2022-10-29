package capitulo6_9;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 1300.59;
		System.out.println(valorProduto);
		String valorProdutoFormatado = formatador.format(valorProduto);
		System.out.println(valorProdutoFormatado);
		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println(numero);
		} catch (ParseException e) {
			System.out.println("Entrada inválida.");
		}
		
		BigDecimal bg = new BigDecimal(5000d);
		bg = bg.divide(BigDecimal.TEN);
		System.out.println(bg);
	}

}
