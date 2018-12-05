
public class TestTimer {

	public static void main(String[] args) {

		Timer t = new Timer(2000);
		System.out.println(t.hasFinished()); 
		try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.hasFinished());
		System.out.println(System.nanoTime());
	}

}
