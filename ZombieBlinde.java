
public class ZombieBlinde extends TrucQuiBouge {

	public ZombieBlinde(double x, double y) {
		super(x, y);
		TRUC_MOVE_X = 0.0005;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		this.position.setPX(this.position.getPX() - TRUC_MOVE_X);
		if (this.position.getPX() < 0)
			GameWorld.setGameLost();

	}

	@Override
	public void dessine() {
		StdDraw.picture(this.position.getX(), this.position.getY(), "Mummy.png", 0.065, 0.133);
		// TODO Auto-generated method stub

	}

}
