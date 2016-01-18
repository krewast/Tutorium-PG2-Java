package threads;

public class Student {

	public synchronized void fertig() {
		System.out.println("Nie gedacht, dass ich so viel schaffe heute!");	
	}

	public void backePizza() {
		for(int i = 1; i <= 3; ++i) {
			System.out.println("Backe, backe Pizza Nummer " + Integer.toString(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fertig mit Pizza backen!");	
		
	}
	
	public void buegeln() {
		for(int i = 1; i <= 3; ++i) {
			System.out.println("Bügle Shirt Nummer " + Integer.toString(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fertig mit bügeln!");
	}
}
