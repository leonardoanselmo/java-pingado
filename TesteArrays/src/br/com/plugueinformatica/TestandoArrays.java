package br.com.plugueinformatica;

public class TestandoArrays {

	public static void main(String[] args) {
		
		String[] nome = new String[5];
		
		nome[0] = "Paulo";
		nome[1] = "Leonardo";
		nome[2] = "de";
		nome[3] = "Freitas";
		nome[4] = "Anselmo";
		
		
		for(String nomes : nome) {
			System.out.println(nomes);
		}
		
		for(int i=0; i < nome.length; i++){
			System.out.println(nome[i]);			
		}
		
		System.out.println(nome.length);

	}

	
}
