
public interface Automovel {
	
	public void acelerar();
	public void frear();
	
	public default void derrapar(){
		acelerar();
		acelerar();
		frear();
	};
	
	public default void pontoMorto(String nome){
		System.out.println("O "+nome+" está em ponto morto.");
	}
	
	public static int getVelocidadeMaxima(){
		return 300;
	}

}
