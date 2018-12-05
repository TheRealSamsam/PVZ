
public class Main {

	public static void main(String[] args) {

		new GameWorld(1);

		StdDraw.setCanvasSize(1000, 1000);

		StdDraw.enableDoubleBuffering();

		while (!GameWorld.gameLost() && !GameWorld.gameWon()) {

			StdDraw.clear();

			if (StdDraw.hasNextKeyTyped()) {
				char key = StdDraw.nextKeyTyped();
				GameWorld.processUserInput(key);
			}

			if (StdDraw.isMousePressed()) {
				GameWorld.processMouseClick(StdDraw.mouseX(), StdDraw.mouseY());
				GameWorld.entites.add(new Temoin((StdDraw.mouseX() -0.338)/ 0.66, (StdDraw.mouseY()-0.2732) / 0.3768,StdDraw.BOOK_RED));
				/*
				 * for (double y=0.2732;y<0.65;y+=0.05) { GameWorld.processMouseClick(0.5, y);
				 * StdDraw.pause(1000);
				 */
				// }
			}

			GameWorld.step();

			GameWorld.dessine();
			//GameWorld.SunGeneration();

			StdDraw.show();

			StdDraw.pause(20);

			// }

			if (GameWorld.gameWon())
				System.out.println("Game won !");
			if (GameWorld.gameLost())
				System.out.println("Game lost...");

		}
	}
}
