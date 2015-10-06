package de.oth.pg2.threads.variante3;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterThread_sync extends Thread {
	private AtomicInteger counter;

	public CounterThread_sync(AtomicInteger counter) {
		this.counter = counter;
	}


	public void run() {
		for (int i = 0; i < 100; i++) {
				counter.addAndGet(1);
				System.out.println(Thread.currentThread().getName() + " - " + this.counter.get());
		}
	}

}
