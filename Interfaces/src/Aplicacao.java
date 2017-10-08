
public class Aplicacao {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		
		//Rota rota = new Rota();		
		//rota.ir(f);
		
		AnelBrilhante a = new AnelBrilhante();
		Iphone i = new Iphone();
		
		Vendedor v = new Vendedor();
		v.mostraPreco("Ferrari", f);
		v.mostraPreco("Anel de brilhantes", a);
		v.mostraPreco("Iphone 8", i);
				
		
	}

}
