import java.text.NumberFormat;

public class Moedas {
	
	public String formatarMoedas(double valor) {
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		String valor_formatado = nf1.format(valor);
		return valor_formatado;
	}
	
	

}
