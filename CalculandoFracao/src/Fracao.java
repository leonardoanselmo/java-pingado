
public class Fracao {
	
	private double numerador;
	private double denominador;
	
	public double getNumerador(){
		return this.numerador;
	}
	
	public void setNumerador(double numerador){
		this.numerador = numerador;
	}
	
	public double getDenominador(){
		return this.denominador; 
	}
	
	public void setDenominador(double denominador){
		this.denominador = denominador;
	}
	
	public double calcularValor(){
		if(denominador == 0){
			return 0;
		}
		return numerador / denominador;
	}
	
	public void definirValores(double numerador, double denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public String obterFracao(){
		return numerador + "/" +denominador;
	}
	
	public Fracao multiplicar(Fracao f){
		Fracao result = new Fracao();
		
		result.setNumerador(this.numerador * f.numerador);
		result.setDenominador(this.denominador * f.denominador);
		
		return result;		
	}

}
