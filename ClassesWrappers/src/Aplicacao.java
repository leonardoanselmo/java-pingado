
public class Aplicacao {
	
	public static void main(String[] args){
		Integer i1 = new Integer(20);
		System.out.println(i1);
		imprimir(i1);
		
		Double d1 = new Double(30.5);
		imprimir(d1);
		imprimir(d1.doubleValue());
		
		int v1 = Integer.parseInt("20");
		System.out.println(v1);
		
		double d2 = Double.parseDouble("30.9");
		System.out.println(d2);
		
	}
	
	private static void imprimir(Object obj){
		System.out.println(obj);
	}

}
