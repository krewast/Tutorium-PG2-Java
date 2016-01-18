package threads;

public class program {

	public static void main(String[] args) {
		Student tom = new Student();
		
		Thread backePizzaThread = new Thread() {
			public void run() {
				tom.backePizza();
			}
		};
		
		Thread buegelnThread = new Thread() {
			public void run() {
				tom.buegeln();
			}
		};
		
		backePizzaThread.start();
		buegelnThread.start();
		//tom.backePizza();
		//tom.buegeln();
		
		tom.fertig();
	}
}
