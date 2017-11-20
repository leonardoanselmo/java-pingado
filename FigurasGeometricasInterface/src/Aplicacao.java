
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Quadrado[] objQuadrado = new Quadrado[4];

        int x = 0;
        while (x < objQuadrado.length){
            objQuadrado[x] = new Quadrado(x+2);
            double result = objQuadrado[x].calcularArea();
            System.out.println("A área do Quadrado: "+x+" é: "+result);
            x++;
        }

        System.out.println();

        for (int i = 0; i<objQuadrado.length;i++){
            objQuadrado[i] = new Quadrado(i+2);
            System.out.println("A área do Quadrado: "+i+" é: "+objQuadrado[i].calcularArea());
        }

        System.out.println();

        Circulo[] objCirculo = new Circulo[3];
        
        for (int i = 0; i < objCirculo.length; i++){
            objCirculo[i] = new Circulo(3);
            System.out.println("A area do Círculo: "+i+" é: "+
                    String.format("%.2f", objCirculo[i].calcularArea()));
        }
        
	}

}
