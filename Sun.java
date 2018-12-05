
public class Sun extends Entite{

	public Sun(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Sun(Position centre) {
		super(centre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dessine() {
		StdDraw.picture(this.position.getX(),this.position.getY(), "Torchwood2.png",0.05,0.05);
		// TODO Auto-generated method stub
		
	}

}
