
public class FiguraComplexa extends Figura{
	
	private Figura[] figuras;
	
	public FiguraComplexa(Figura[] figuras){
		this.figuras = figuras;
	}
	
	@Override
	public double calculaArea() {
		double areaTotal = 0.0;
		
		for (int i= 0; i < figuras.length; i++) {
			areaTotal += figuras[i].calculaArea();
		}
		
		return areaTotal;
	}

}
