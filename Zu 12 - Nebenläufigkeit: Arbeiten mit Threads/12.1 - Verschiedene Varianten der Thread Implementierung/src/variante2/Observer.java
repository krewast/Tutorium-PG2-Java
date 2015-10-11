package de.oth.pg2.threads.variante2;

import java.util.concurrent.locks.Condition;

public class Observer extends Thread {
	private Counter counter;
	public Condition condition;

	public Observer(Counter c)  {
		counter = c;
		condition = counter.finished;
	}

	public void run() {
		counter.lock.lock();

		while (counter.getCount( ) < 100)  {
			try {
				condition.await();
		    } catch (InterruptedException e) { }
		}

		System.out.println("fertig");
		System.exit(0);

		counter.lock.unlock();
	}
}
