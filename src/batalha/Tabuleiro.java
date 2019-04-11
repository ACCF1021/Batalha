package batalha;

public class Tabuleiro {
	static int Y = 9;
	static int X = 9;
	
	ConstNavio Navio = new ConstNavio(1,0);
	ConstNavio Navio2 = new ConstNavio(7,8);
	
	public void Tabuleiro() {
		int[][] tabuleiro = new int[X][Y];		
		
		for(int c=0; c < X; c++) {
			for(int l=0; l < Y; l++) {
				if(c == Navio.proa.posX && l == Navio.proa.posY || c == Navio.conves.posX && l == Navio.conves.posY || c == Navio.popa.posX && l == Navio.popa.posY) {
					System.out.printf("x");
				} else if(c == Navio2.proa.posX && l == Navio2.proa.posY || c == Navio2.conves.posX && l == Navio2.conves.posY || c == Navio2.popa.posX && l == Navio2.popa.posY){
					System.out.printf("x");
				} else {
					System.out.printf("o");
				} 
				
						
			}
			System.out.println("");
		}
	}
			
			
}
