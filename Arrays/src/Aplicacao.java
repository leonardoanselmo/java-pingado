
public class Aplicacao {
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		array[0] = 9;
		array[1] = 8;
		array[2] = 21;
		array[3] = 5;
		array[4] = 16;		
		int tamanho = array.length;
		
		System.out.println(tamanho);
		System.out.println(array[0]);
		
		for (int i : array) {
			System.out.println("Elemento: "+i);
		}		
		
		String[] contato = new String[10];
		contato[0] = "Leonardo Anselmo";
		contato[2] = "Débora Anselmo";
		contato[4] = "Patrícia Anselmo";
		contato[6] = "Lessa Anselmo";
		contato[1] = "Ló Anselmo";
						
		for (String nome : contato) {
			if (nome != null) {
				System.out.println("Contato: "+nome);	
			}			
		}
 		
	}

}
