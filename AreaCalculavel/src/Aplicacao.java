
public class Aplicacao {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado(2);
		double area = q.calcularArea();
		
		System.out.println("A area do quadrado é: "+area);
		
		Circulo c = new Circulo(4);
		double raio = c.calcularArea();
		
		System.out.println("O raio do circulo é: "+raio);
		
		Retangulo r = new Retangulo(4, 8);
		double area2 = r.calcularArea();
		
		System.out.println("A area do retangulo é: "+area2);
		
	}

}
