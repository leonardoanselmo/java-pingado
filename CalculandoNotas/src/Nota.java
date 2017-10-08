
public class Nota {
	
	private double[] notas;
	
	public Nota(double[] notas){
		this.notas = notas;
	}
	
	public double calcularMedia(){
		double media = 0.0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		
		return (media/notas.length);
	}

}
