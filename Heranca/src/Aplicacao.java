
public class Aplicacao {
	
	public static void main(String args[]){
		
		System.out.println("Carro");
		System.out.println("=====");
		Carro c = new Carro();		
		c.setMarca("Volks");
		c.setModelo("Sportline");
		c.setAno(2013);
		c.setQuatroPortas(true);
		c.imprimirDados();
		// c.buzinar();
		
		System.out.println("");
		
		System.out.println("Motocicleta");
		System.out.println("===========");
		Motocicleta m = new Motocicleta();
		m.setMarca("Honda");
		m.setModelo("CG 125");
		m.setAno(2017);
		m.imprimirDados();
		//m.buzinar();
		//m.empinar();
		
		//Caminhao cam = new Caminhao();
		//cam.buzinar();
		
	}

}
