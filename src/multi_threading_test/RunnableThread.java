package multi_threading_test;

public class RunnableThread implements Runnable {
	
	// （2）方法说明： 通过实现 Runnable 接口，实现JAVA 多线程；

		// 定义100张票
		private int ticket = 300;

		// 定义同一把锁
		 private Object obj = new Object();

		public void run() {

			while (true) {
				synchronized (obj) {

					if (ticket > 0) {

						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println(Thread.currentThread().getName()+ " 正在出售第" + (ticket--) + "张票");
					}
				}

			}
		}
}
