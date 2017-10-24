import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Feijão", 2.50, 4,10,2020 );
		Produto prod2 = new Produto("Café", 1.0, 1,1,2022);
		Produto prod3 = new Produto("Beterraba", 0.9, 12,11,2017);
		
		Locale l = new Locale("pt", "BR");
		
		System.out.println(String.format(l, "%d - %12s %09.2f %s", 1, prod1.getNome(), prod1.getPeso(), prod1.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d - %12s %09.2f %s", 2, prod2.getNome(), prod2.getPeso(), prod2.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d - %12s %09.2f %s", 3, prod3.getNome(), prod3.getPeso(), prod3.getFormattedDataValidate()));
		
	}

}
