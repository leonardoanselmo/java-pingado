import java.text.NumberFormat;

public class Aplicacao {

	public static void main(String[] args) {
		
		double d = 145.4;
		
		NumberFormat nf1 = NumberFormat.getNumberInstance();
		String s1 = nf1.format(d);
		System.out.println(s1);

	}

}
