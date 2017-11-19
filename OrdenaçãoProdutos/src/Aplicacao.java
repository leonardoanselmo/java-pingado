import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Produtos produtos = new Produtos(new ArrayList<Produto>());
		
		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Maçã", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.3);
		
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		
		produtos.imprimirProdutos();	
		produtos.mudarColecao(new HashSet<Produto>());
		produtos.imprimirProdutos();
		produtos.mudarColecao(new TreeSet<Produto>());
		produtos.imprimirProdutos();
	}

}
