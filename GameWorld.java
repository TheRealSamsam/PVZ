import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GameWorld {
	private static int lvl;
	// remettre en private
	protected static List<Entite> entites;
	private static int sun;
	private static boolean gameWon;
	private static Timer t = new Timer(650);

	private static boolean gameLost;

	public GameWorld(int lvl) {
		new Plateau();
		GameWorld.lvl = lvl;
		gameWon = false;
		gameLost = false;

		entites = new LinkedList<Entite>();

		entites.add(new ZombieBlinde(1, 0.5));
		entites.add(new Sun(Plateau.cases[1][1].centre));

	}

	public static void SunGeneration() {
		if (t.hasFinished()) {
			double x = Math.random();
			double y = Math.random();
			while (positionToCentre(x, y) == null) {
				x = Math.random();
				y = Math.random();
			}

			entites.add(new Sun(positionToCentre(x, y)));

			t = new Timer(650);

		}

	}

	public void ZombieGeneration() {

	}

	/**
	 * Gestion des interactions clavier avec l'utilisateur
	 * 
	 * @param key Touche pressee par l'utilisateur
	 */
	public static void processUserInput(char key) {
		switch (key) {
		case 't':

			System.out.println("Le joueur veut planter un Tournesol...");
			// TODO
			break;
		case 'p':
			System.out.println("Le joueur veut planter un Tire-Pois...");
			// TODO
			break;
		case 'n':
			System.out.println("Le joueur veut planter une Noix...");
			// TODO
			break;

		default:
			System.out.println("Touche non prise en charge");
			break;
		}
	}

	public static Position positionToCentre(double x, double y) {

		if (0.338 < x && x < 0.998 && 0.2732 < y && y < 0.65) {
			x = (x - 0.338) / 0.66;
			y = (y - 0.2732) / 0.3768;
			return Plateau.cases[(int) (x * 9)][(int) (y * 5)].centre;
		}

		return null;
	}

	/**
	 * gestion des clics utilisateurs
	 * 
	 * @param x x(clic)
	 * @param y y(clic)
	 * 
	 */
	public static void processMouseClick(double x, double y) {
	

		if (positionToCentre(x, y) != null) {
			entites.add(new Temoin(positionToCentre(x, y),StdDraw.GREEN));
			Entite b = null;
			for (Entite a : entites) {

				if (a.position.equals(positionToCentre(x, y))) {
					b = a;
					break;

				}

			}

			if (b != null)
				entites.remove(b);
			sun += 25;

		} else
		//	System.out.println("was null");
		StdDraw.pause(40);
		//System.out.println("end of MP");

	}

	public static void step() {
		for (Entite entite : entites)
			entite.step();
	}

	public static void decor() {
		StdDraw.picture(0.5, 0.5, "PvZ2_Egypt01.jpg", 1, 0.7);

		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				StdDraw.point(Plateau.cases[i][j].centre.getX(), Plateau.cases[i][j].centre.getY());

			}
		}
	}

	static void dessine() {
		decor();

		for (Entite entite : entites)
			entite.dessine();
	}

	public static boolean gameWon() {
		return gameWon;
	}

	public static boolean gameLost() {
		return gameLost;
	}

	public static void setGameWon() {
		GameWorld.gameWon = true;
	}

	public static void setGameLost() {
		GameWorld.gameLost = true;
	}

}
