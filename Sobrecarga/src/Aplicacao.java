
public class Aplicacao {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int soma = m.somar(20, 10);
		int somax = m.somar(10, 20, 5);
		double soma2 = m.somar(10.0, 20);
		
		System.out.println("A Soma é: "+soma);
		System.out.println("A Soma é: "+somax);
		System.out.println("A Soma é: "+soma2);

	}

}
