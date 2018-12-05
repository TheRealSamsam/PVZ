
public class Plateau {
	 class Case {
		protected boolean occupe;
		protected Position centre;

		public Case(boolean occupe, Position centre) {

			this.occupe = occupe;
			this.centre = centre;
		}

	}
	
	

	protected static Case[][] cases;

	public Plateau() {

		cases = new Case[9][5];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				cases[i][j] = new Case(false, new Position((i*1/9.0) + (1/18.0), (j/5.0) + (1/10.0)));
			

			}
		}
	}
}
