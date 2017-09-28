
public class Aplicacao {

	public static void main(String[] args) {
		
		/*
		int num = 10;
		if (num > 10) {
			System.out.println("O número é maior que 10.");
			
		} else if (num < 10){
			System.out.println("O número não é maior que 10.");
			
		} else {
			System.out.println("O número é 10.");
			
		}
		*/
		
		
		int num1 = 3;
		
		switch (num1) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("O número é 1, 2, 3, 4 ou 5.");
			break;
		case 10:
			System.out.println("O numero é 10");
			break;
		case 15:
			System.out.println("O numero é 15.");
			break;
		default:
			System.out.println("O número é outro.");
			break;
		}
		

	}

}
