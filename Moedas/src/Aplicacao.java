

public class Aplicacao {

	public static void main(String[] args) {
		
		Moedas objMoeda = new Moedas();
		String valor_em_dinheiro = objMoeda.formatarMoedas(1450.2);
		
		System.out.println("O valor é: "+valor_em_dinheiro);	
		System.out.println("Moeda Atual: "+Moedas.MOEDA_ATUAL);
		

	}

}
