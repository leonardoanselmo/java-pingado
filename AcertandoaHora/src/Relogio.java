
public class Relogio {
	
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
		
	public void acertarRelogio(int hora, int minuto, int segundo){
		hora = hora % 12;
		
		ponteiroHora.setPosicao(hora);
		ponteiroMinuto.setPosicao(minuto/5);
		ponteiroSegundo.setPosicao(segundo/5);
		
	}
	
	public int lerHora(){
		return ponteiroHora.getPosicao();
	}
	
	public int lerMinuto(){
		return ponteiroMinuto.getPosicao()*5;
	}
	
	public int lerSegundo(){
		return ponteiroSegundo.getPosicao()*5;
	}

}
