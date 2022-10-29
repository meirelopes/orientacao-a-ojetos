package capitulo6.exercicio6_10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valorProduto = scanner.nextDouble();
		BigDecimal big = new BigDecimal(valorProduto);
		BigDecimal valorPorcentagem = new BigDecimal(0.1);
		BigDecimal porcentagem = big.multiply(valorPorcentagem);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		System.out.println("10% do valor informado: "+formatador.format(porcentagem));
		scanner.close();
	}
}
