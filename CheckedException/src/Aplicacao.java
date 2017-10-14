
public class Aplicacao {

	public static void main(String[] args) {

		ContaBancaria c = new ContaBancaria(1000);
		boolean sucess = c.sacar(2100);
		
		System.out.println(sucess);
		System.out.println(c.getSaldo());

	}

}
