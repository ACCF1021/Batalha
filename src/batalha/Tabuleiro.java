package batalha;

public class Tabuleiro {
	static int Y = 9;
	static int X = 9;
	
	public void Tabuleiro() {
		int[][] tabuleiro = new int[X][Y];
		
		ConstNavio Navio = new ConstNavio(1,1);
		/*Navio.proa.posX = 1;
		Navio.conves.posX = 1;
		Navio.popa.posX = 1;
		
		Navio.proa.posY = 0;
		Navio.conves.posY = 0;
		Navio.popa.posY = 0;*/
		
		
		for(int l=0; l < X; l++) {
			for(int c=0; c < Y; c++) {
				if(c == Navio.proa.posX && l == Navio.proa.posY || c == Navio.conves.posX && l == Navio.conves.posY || c == Navio.popa.posX && l == Navio.popa.posY) {
					System.out.printf("x");
				} else {
					System.out.printf("o");
				}
				
						
			}
			System.out.println("");
		}
	}
			
			
}
