
public class FactoryTest {

	public static void main(String[] args) {
		
		FactoryPessoa factory = new FactoryPessoa();
		
		String nome = "Leonardo Anselmo";
		String sexo = "M";
		
		factory.getPessoa(nome, sexo);
		
		String nome1 = "Patrícia Anselmo";
		String sexo1 = "F";
		
		factory.getPessoa(nome1, sexo1);
		
	}

}
