import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Map<Integer, Produto> map = new HashMap<>();
		
		Produto p1 = new Produto(32, "Mouse ps2");
		Produto p2 = new Produto(54, "Teclado usb");
		Produto p3 = new Produto(23, "Disco rígido 500GB");
		
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);		
		
		Produto p = map.get(3);
		System.out.println(p);
		
		//Iterar pela chave
		Set<Integer> keys = map.keySet();
		for (Integer chave : keys) {
			System.out.println(chave);
		}
		
		//Iterar pelos valores
		Collection<Produto> values = map.values();
		for (Produto prod : values) {
			System.out.println(prod);
		}
		
		//Iterar com chave e valores
		Set<Map.Entry<Integer, Produto>> entries =  map.entrySet();
		for (Map.Entry<Integer, Produto> entry : entries) {
			System.out.println(entry);
		}
		
		
		
	}
	
}
