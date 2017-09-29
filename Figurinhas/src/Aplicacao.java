
public class Aplicacao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Leonardo");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Patrícia");
		
		p1.receber(5);
		p1.receber(7);
		
		System.out.println(p1.getNome() + " = " + p1.getNumFigurinhas() + " figurinhas");
		System.out.println(p2.getNome() + " = " + p2.getNumFigurinhas() + " figurinhas");
		
		p1.dar(2, p2);
		
		System.out.println(p1.getNome() + " = " + p1.getNumFigurinhas() + " figurinhas");
		System.out.println(p2.getNome() + " = " + p2.getNumFigurinhas() + " figurinhas");
		
		p2.dar(1, p1);
		
		System.out.println(p2.getNome() + " = " + p2.getNumFigurinhas() + " figurinhas");
		System.out.println(p1.getNome() + " = " + p1.getNumFigurinhas() + " figurinhas");
		
	}
	
}
