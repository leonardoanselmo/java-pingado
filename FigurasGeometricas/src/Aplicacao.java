
public class Aplicacao {

	public static void main(String[] args) {
		
		Triangulo objTriangulo = new Triangulo();
		Quadrado  objQuadrado  = new Quadrado();
		Circulo   objCirculo   = new Circulo();
		Trapezio  objTrapezio  = new Trapezio();
		
		objTriangulo.setBase(3);
		objTriangulo.setAltura(4);
		
		objQuadrado.setLado(4);
		
		objCirculo.setRaio(3);
		
		objTrapezio.setBaseMaior(4);
		objTrapezio.setBaseMenor(3);
		objTrapezio.setAltura(2);
						
		System.out.println("A area do Triangulo é: "+objTriangulo.calcularArea());
		System.out.println("A area do Quadrado é:  "+objQuadrado.calcularArea());
		System.out.println("A area do Circulo é: "+objCirculo.calcularArea());
		System.out.println("A area do Trapezio é: "+objTrapezio.calcularArea());

	}

}
