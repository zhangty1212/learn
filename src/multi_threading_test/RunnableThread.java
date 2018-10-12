package multi_threading_test;

public class RunnableThread implements Runnable {
	
	// ��2������˵���� ͨ��ʵ�� Runnable �ӿڣ�ʵ��JAVA ���̣߳�

		// ����100��Ʊ
		private int ticket = 300;

		// ����ͬһ����
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

						System.out.println(Thread.currentThread().getName()+ " ���ڳ��۵�" + (ticket--) + "��Ʊ");
					}
				}

			}
		}
}
