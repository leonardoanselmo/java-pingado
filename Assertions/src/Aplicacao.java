
public class Aplicacao {

	public static void main(String[] args) {
		
		ResultadoBaskara r = new ResultadoBaskara();
				
		//double a = 1.0;
		//double b = 3;
		//double c = -4;
		
		double a = 1;
		double b = 2;
		double c = 16;
		
		Matematica.calcularBaskara(a, b, c, r);
		
		System.out.println("r1 = "+r.getR1());
		System.out.println("r2 = "+r.getR2());

	}

}
