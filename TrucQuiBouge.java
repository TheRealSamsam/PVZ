
public abstract class TrucQuiBouge extends Entite {

	protected double TRUC_MOVE_X;
	
	protected boolean statut;
	protected Timer timer;
	
	public TrucQuiBouge(double x, double y) {
		super(x, y);
		this.statut=true;
		timer = new Timer(2500); 
	}
	
	@Override
	public abstract void step();

	@Override
	public abstract void dessine();

}
