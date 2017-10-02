
public class Aplicacao {
	
	public static void main(String[] args){
		
		// Matematica m = new Matematica();
		// int soma = m.somar(20, 10);
		// int subtracao = m.subtrair(5, 2);
		
		int soma = Matematica.somar(20, 10);
		int subtracao = Matematica.subtrair(15, 7);
		
		System.out.println("A soma é: "+soma);		
		System.out.println("A Subtracao é: "+subtracao);
		
		Contador c1 = new Contador();
		c1.incrementar();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		c2.incrementar();
		
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(c3.getValor());
		
		double media = Constantes.MEDIA_DA_PROVA;
		System.out.println(media);
		
	}

}
