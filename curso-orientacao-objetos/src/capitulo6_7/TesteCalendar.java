package capitulo6_7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.DAY_OF_MONTH, 02);
		c.set(Calendar.MONTH, 8);
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 3);
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String hora = formatador.format(c.getTime());
		System.out.println(hora);
		c.add(Calendar.DAY_OF_MONTH, 1);
		String horaAlterada = formatador.format(c.getTime());
		System.out.println(horaAlterada);
	
		
		

	}

}
