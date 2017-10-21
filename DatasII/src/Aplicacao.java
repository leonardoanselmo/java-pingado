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
		
		Date d = cal.getTime();
		System.out.println(d);

	}

}
