
public class Aplicacao {
	
	public static void main(String[] args) {
		
		Relogio objRelogio = new Relogio();
		
		objRelogio.acertarRelogio(22, 30, 50);
		
		System.out.println("Posição da Hora: "+objRelogio.ponteiroHora.getPosicao());
		System.out.println("Posição do minuto: "+objRelogio.ponteiroMinuto.getPosicao());
		System.out.println("Posição do segundo: "+objRelogio.ponteiroSegundo.getPosicao());
		
		int hora = objRelogio.lerHora();
		int minuto = objRelogio.lerMinuto();
		int segundo = objRelogio.lerSegundo();
		
		System.out.println("Hora: "+hora+":"+minuto+":"+segundo+" hs.");		
		
	}

}
