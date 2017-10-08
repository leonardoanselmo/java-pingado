
public class Aplicacao {

	public static void main(String[] args) {
		
		double[] notas = {9.0, 6.0, 7, 5};
		
		Nota media = new Nota(notas);
		
		System.out.println("A Média é: "+media.calcularMedia());
			

	}

}
