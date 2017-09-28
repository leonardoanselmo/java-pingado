
public class Aplicacao {

	public static void main(String[] args) {
		
		int i = 1;
		int qtdeNotas = 0;		
		double somaNotas = 0.0;
		
		
		while (true) {
			System.out.println("Nota " + (i++) + ": ");
			double nota = Console.readDouble();
			
			if(nota == -1){
				break;
			} else if (nota < 0 || nota > 10){
				System.out.println("Nota inválida.");
				continue;
			}
			
			somaNotas += nota;
			qtdeNotas++;			
		}
		
		double media = (somaNotas / qtdeNotas);
		System.out.println("A média do aluno é: "+media);

	}

}
