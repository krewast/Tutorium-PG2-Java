package de.oth.pg2.threads.variante2;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.lock.lock();

			if (counter.getCount() < 1000)  {
				this.counter.increase();
			} else {
				counter.finished.signal();
			}

			counter.lock.unlock();
    	}
    }
}
