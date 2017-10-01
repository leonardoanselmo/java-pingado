
public class Aplicacao {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo();		
		double area = r1.calcularArea();
		
		System.out.println("Area do retangulo: "+area);
		
		Retangulo r2 = new Retangulo(3, 7);
		double area2 = r2.calcularArea();
		
		System.out.println("Area do retangulo 2: "+area2);
		
		Quadrado q = new Quadrado(2);
		
		System.out.println("A area do quadrado é: "+q.calcularArea());
		System.out.println("Leonardo Anselmo".length());


	}

}
