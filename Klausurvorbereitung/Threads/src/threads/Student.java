package threads;

public class Student {
	
	public boolean fertigPizza = false;
	public boolean fertigBuegeln = false;
	public Object wait = new Object();
	
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
			if (fertigBuegeln) {
				synchronized(wait) {
					try {
						wait();
						System.out.println("FERTIG MIT BUEGELN");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
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
			if (i == 3) {
				synchronized(wait) {
					notify();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		synchronized(this) {
			System.out.println("Fertig mit bügeln!");
			this.fertigBuegeln = true;
			notifyAll();
		}
	}
}
