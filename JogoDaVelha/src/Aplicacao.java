import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		char[][] tabuleiro = new char[3][3];
	
		Tabuleiro.tabuleiroVazio(tabuleiro);
		
		List<int[]> jogadas = new ArrayList<int[]>();
		
		jogadas.add(new int[] {1, 1, 'X'});
		jogadas.add(new int[] {2, 2, '0'});
		jogadas.add(new int[] {2, 0, 'X'});
		jogadas.add(new int[] {0, 2, '0'});
		jogadas.add(new int[] {1, 2, 'X'});
		jogadas.add(new int[] {1, 0, '0'});
				
		Tabuleiro.preencherTabuleiro(jogadas, tabuleiro);
				
		Tabuleiro.tabuleiroPreenchido(tabuleiro);
		
	}

}
