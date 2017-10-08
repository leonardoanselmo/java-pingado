
public class Ponto2d {
	
	private double x;
	private double y;
		
	public Ponto2d(double x, double y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {		
		return "Os pontos"+" são: eixo x: "+x+" - eixo y: "+y;		
	}	

}
