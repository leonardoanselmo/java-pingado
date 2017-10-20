
public class Aplicacao {

	public static void main(String[] args) {
		
		//String s = "";
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			s.append("X");
		}

		System.out.println(s);
	}

}
