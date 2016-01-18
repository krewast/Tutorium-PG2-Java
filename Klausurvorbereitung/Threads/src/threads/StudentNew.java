package threads;

public class StudentNew {
	
	public boolean fertigPizza = false;
	public boolean fertigBuegeln = false;
	
	public synchronized void fertig() {
		while (!fertigPizza && !fertigBuegeln) {
			try {
				wait();
				System.out.println("Nie gedacht, dass ich so viel schaffe heute!");	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
		synchronized(this) {
			this.fertigPizza = true;
			notifyAll();
		}
		
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
		synchronized(this) {
			this.fertigBuegeln = true;
			notifyAll();
		}
	}
}
