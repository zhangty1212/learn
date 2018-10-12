package multi_threading_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	// ��1������˵���� ͨ���̳� Thread �࣬ʵ��JAVA ���̣߳�

	// ����ͬһ���� private Object obj = new Object();

	// ����100��Ʊ
	private int ticket = 100;

	private Lock lock = new ReentrantLock();

	public void run() {

		while (true) {

			try {
				// ����
				lock.lock();

				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(getName() + " ���ڳ��۵�" + (ticket--) + "��Ʊ");
				}
			} finally {

				// �ͷ���
				lock.unlock();
			}

		}
	}
}
