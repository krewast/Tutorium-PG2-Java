package de.oth.pg2.threads.variante1;

public class Counter {
	public int count;

	public Counter() {
		count = 0;
	}

	public void increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " - "
				+ this.count);
	}

	public int getCounter() {
		return this.count;
	}
}
