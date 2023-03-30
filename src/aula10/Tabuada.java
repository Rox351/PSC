package aula10;

public class Tabuada {
	public static void main(String[] args) {
		int tabuada[][] = new int[10][10];
		
		for (int linha = 0; linha < 10; linha++) {			
			for (int coluna = 0; coluna < 10; coluna++ ) {
				tabuada[linha][coluna] = (linha+1)*(coluna+1);
			}
		}
	}
}
