import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aplicacao {

	public static void main(String[] args) {
		
		Date date = new Date();
		long mili = date.getTime();
		System.out.println(mili);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 1);
		
		cal.set(2020, 1, 5, 13, 30, 0);
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -30);
		
		Date d = cal.getTime();
		System.out.println(d);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df1.format(d);
		System.out.println(f1); // Século com 2 dígitos.
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String f2 = df2.format(d);
		System.out.println(f2); // Século com 4 dígitos.
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String f3 = df3.format(d);
		System.out.println(f3);
		
	}

}
