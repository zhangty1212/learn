package multi_threading_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	// （1）方法说明： 通过继承 Thread 类，实现JAVA 多线程；

	// 定义同一把锁 private Object obj = new Object();

	// 定义100张票
	private int ticket = 100;

	private Lock lock = new ReentrantLock();

	public void run() {

		while (true) {

			try {
				// 加锁
				lock.lock();

				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(getName() + " 正在出售第" + (ticket--) + "张票");
				}
			} finally {

				// 释放锁
				lock.unlock();
			}

		}
	}
}
