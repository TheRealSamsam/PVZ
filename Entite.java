
public abstract class Entite {
	
	
	protected Position position;
	
	public Entite(Position p) {
		position=p;
	}
	public Entite(double x, double y) {
		position = new Position(x, y);
	}
	

	public double getPX() {
		return position.getPX();
	}
	
	public double getPY() {
		return this.position.getPY();
	}
	
	
	public void setPosition(Position p){
		this.position = p;
	}
	

	public abstract void step();
	
	
	public abstract void dessine();
	

}
