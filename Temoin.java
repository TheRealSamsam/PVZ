import java.awt.Color;

public class Temoin extends Entite{
	

	public Color c;

	public Temoin(double x, double y, Color c) {
		super(x, y);
		this.c=c;
		// TODO Auto-generated constructor stub
	}
	public Temoin (Position p, Color c) {
		super(p);
		this.c=c;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dessine() {
		StdDraw.setPenRadius(0.025);
		StdDraw.setPenColor(c);
		StdDraw.point(position.getX(), position.getY());
		// TODO Auto-generated method stub
		
	}

}
