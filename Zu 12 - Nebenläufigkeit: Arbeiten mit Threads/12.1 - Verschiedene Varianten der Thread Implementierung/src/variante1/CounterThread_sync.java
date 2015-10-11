package de.oth.pg2.threads.variante1;

public class CounterThread_sync extends Thread {
	private Counter counter;

	public CounterThread_sync(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (counter) {
				if (counter.count == 1000) {
					return;
				}

				counter.increment();
			}
		}
	}
}
