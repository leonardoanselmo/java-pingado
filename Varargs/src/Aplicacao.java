
public class Aplicacao {
	
	public static void main(String[] args) {
		
		imprimir("Paulo", "Leonardo", "de", "Freitas", "Anselmo");
		System.out.println(somar(2,4,5,6,9,14,25));
		System.out.println(somar());
		
		String[] objetos = {"casa", "jarro", "caneta", "lápis", "caderno"};
		imprimir(objetos);
		
		
	}
	
	public static void imprimir(String... textos){
		for (String texto : textos) {
			System.out.println("Textos: "+texto);
		}
	}
		
	public static int somar(int... numeros){		
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma;
	}
	
}
