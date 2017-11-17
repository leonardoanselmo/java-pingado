import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto(4, "Arroz", 3.9);
		Produto p2 = new Produto(3, "Feijão", 3.9);
		Produto p3 = new Produto(5, "Arroz", 2.9);
		Produto p4 = new Produto(1, "Lentilha", 6.5);
		Produto p5 = new Produto(2, "Lasanha", 8.0);
		
		//Set<Produto> produtos = new TreeSet<>();
		Set<Produto> produtos = new TreeSet<Produto>(new DescricaoComparator());
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}		
		
	}

}
