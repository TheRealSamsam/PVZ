
public class ExempleQuiBouge extends TrucQuiBouge{

	public ExempleQuiBouge(double x, double y) {
		super(x, y);
		TRUC_MOVE_X = 0.0025;
		
		// TODO Auto-generated constructor stub
	}
	protected double TRUC_SIZE = 0.05;

@Override
public void step() {
	this.position.setPX(this.position.getPX() + TRUC_MOVE_X);
	if (this.position.getPX() > 1.0) this.position.setPX(0.0); 
	
	
	if (timer.hasFinished()) {
		this.statut = !this.statut;
		timer.restart(); 
	}
}

@Override
public void dessine() {
	if (statut)
		StdDraw.setPenColor(StdDraw.RED);
	else
		StdDraw.setPenColor(StdDraw.BLUE);
	StdDraw.filledSquare(this.position.getX(), this.position.getY(), TRUC_SIZE);

}
}
