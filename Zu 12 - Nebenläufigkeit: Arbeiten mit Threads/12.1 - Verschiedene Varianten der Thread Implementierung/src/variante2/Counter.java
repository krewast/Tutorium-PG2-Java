package de.oth.pg2.threads.variante2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	private int count = 0;
	public Lock lock = new ReentrantLock();
    Condition finished = lock.newCondition( );

	public void increase() {
		this.count++;
		System.out.println(Thread.currentThread().getName() + " - " + this.count);
	}

	public int getCount() {
		return this.count;
	}
}
