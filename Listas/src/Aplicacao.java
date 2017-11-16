import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("Leonardo Anselmo");
		l.add("Programador");
		l.add("Paty Anselmo");
		l.add("Débora Anselmo");
		l.add(0,"Primeiro elemento");
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
						
		for (String nome : l) {
			System.out.println("Nome: "+nome);
		}
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}		
		
	}

}
