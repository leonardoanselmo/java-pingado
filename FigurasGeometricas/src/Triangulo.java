
public class Triangulo {
	
	private double base;
	private double altura;
	
	public double getBase(){
		return this.base;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double calcularArea(){
		return (base * altura)/2;		
	}

}
