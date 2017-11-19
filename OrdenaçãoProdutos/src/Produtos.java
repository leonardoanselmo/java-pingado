import java.util.Collection;

public class Produtos {
	
	private Collection<Produto> produtos;
	
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void mudarColecao(Collection<Produto> produtos){
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		this.produtos.addAll(temp);		
	}
	
	public void adicionar(Produto produto){
		produtos.add(produto);
	}
	
	public void imprimirProdutos(){
		System.out.println("Produtos armazenados em: "+produtos.getClass().getName());
		for (Produto produto : produtos) {
			System.out.println(produto);
		}		
		System.out.println("------------------------------------");
	}

}
