package de.oth.pg2.threads;

import java.util.concurrent.atomic.AtomicInteger;

import de.oth.pg2.threads.variante1.Counter;
import de.oth.pg2.threads.variante1.CounterThread_sync;

public class Programm {
	public static void variante1() {
		Counter counter = new Counter();
		for (int i = 0; i < 10; i++) {
			new CounterThread_sync(counter).start();
		}
	}

	
	public static void variante2() {
		de.oth.pg2.threads.variante2.Counter counter = new de.oth.pg2.threads.variante2.Counter();
		(new de.oth.pg2.threads.variante2.Observer(counter)).start();

		for (int i = 0; i < 100; i++) {
			(new de.oth.pg2.threads.variante2.CounterThread(counter)).start();
		}
	}
	
	public static void variante3() {
		AtomicInteger counter = new AtomicInteger();
		for (int i = 0; i < 100; i++) {
			new de.oth.pg2.threads.variante3.CounterThread_sync(counter).start();
		}
		
		
	}

	public static void main(String[] args) {
//		variante1();
//		variante2();
		variante3();
	}
}
