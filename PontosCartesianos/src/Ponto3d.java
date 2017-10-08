
public class Ponto3d extends Ponto2d {
	
	private double z;
		
	public Ponto3d(double x, double y, double z){
		super(x ,y);
		this.z = z;		
	}
	
	@Override
	public String toString() {		
		return super.toString()+" eixo z: "+z;		
	}

}
