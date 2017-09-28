
public class Aplicacao {

	public static void main(String[] args) {
		
		for(int i = 10; i <= 25; i++){
			System.out.println(i);
		}
		
		int num = 1;
		int soma = 0;
		while (num < 100){
			soma += num;
			num += 2;			
		}
		System.out.println("A soma dos números de 1 a 100 é: "+soma);
		
		int numsoma = 0;
		int numInicial = 0;
		while (numsoma < 100) {
			System.out.println("Números: "+numInicial);
			numInicial++;
			numsoma += numInicial;			
		}
		
		for(int i = 1; i <= 10; i++){
			System.out.println("9 x "+i+" = "+(9*i));
		}
		
	}

}
