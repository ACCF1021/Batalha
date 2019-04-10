package batalha;

public class ConstNavio {
	
	PartNavio proa = new PartNavio();
	PartNavio conves = new PartNavio();
	PartNavio popa = new PartNavio();

	public ConstNavio(int x, int y) {
		
		this.proa.posX = x;
		this.conves.posX = x;
		this.popa.posX = x;
		
		this.proa.posX = y-1;
		this.conves.posX = y;
		this.popa.posX = y+1;
	}
}
