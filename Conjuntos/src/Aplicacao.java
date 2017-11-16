import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		
		set.add("A7");		
		set.add("C3");		
		set.add("E1");
		set.add("F6");
		set.add("D2");
		set.add("G8");
		set.add("B4");
		set.add("D2");		
		
		for (String letra : set) {
			System.out.println(letra);
		}
		
		
	}

}
