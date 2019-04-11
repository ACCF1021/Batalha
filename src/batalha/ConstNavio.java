package batalha;

public class ConstNavio {
	
	PartNavio proa = new PartNavio();
	PartNavio conves = new PartNavio();
	PartNavio popa = new PartNavio();

	public ConstNavio(int x, int y) {
		
		this.proa.posX = x-1;
		this.conves.posX = x;
		this.popa.posX = x+1;
		
		this.proa.posY = y;
		this.conves.posY = y;
		this.popa.posY = y;
	}
}
