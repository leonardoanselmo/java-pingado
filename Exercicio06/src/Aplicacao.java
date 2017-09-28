
public class Aplicacao {

	public static void main(String[] args) {
		
		int dia = 29;
		int mes = 02;
		int ano = 2000;
		
		if ((dia >= 01 && dia <= 31) && (mes >= 01 && mes <= 12) && (ano >= 1900)){
			if (dia >= 29 && mes == 02) {
				System.out.println("Data inválida.");
			} else {
				System.out.println("Data válida.");
			}					
		} else {
			System.out.println("Data inválida.");
		}

	}

}
