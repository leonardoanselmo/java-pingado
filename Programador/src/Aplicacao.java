
public class Aplicacao {

	public static void main(String[] args) {
		
		Tipo tipo = new Tipo();
		
		Pleno pleno = new Pleno();
		tipo.verificarCategoria(pleno);
		
		Senior senior = new Senior();
		tipo.verificarCategoria(senior);
		
		Junior junior = new Junior();
		tipo.verificarCategoria(junior);
		
		
		
	}

}
