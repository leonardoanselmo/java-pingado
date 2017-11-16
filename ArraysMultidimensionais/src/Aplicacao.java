
public class Aplicacao {
	
	public static void main(String[] args) {
		
		int[][] array = new int[3][5];
			
		array[2][3] = 10;
		array[0][0] = 9;
		
		System.out.println(array[0].length);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
				
	}
	
}
