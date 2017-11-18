import java.util.List;

public class Tabuleiro {

	public static void tabuleiroVazio(char[][] tabuleiro){
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j]=' ';
			}			
		}
	}
	
	public static void tabuleiroPreenchido(char[][] tabuleiro){
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void preencherTabuleiro(List<int[]> jogadas, char[][] tabuleiro){
		for (int[] jogada : jogadas) {
			int linha = jogada[0];
			int coluna = jogada[1];
			char simbolo = (char) jogada[2];
			
			tabuleiro[linha][coluna] = simbolo;
		}
	}
	
}
