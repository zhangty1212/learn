package multi_threading_test;

public class RunnableThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��2������˵���� ͨ��ʵ�� Runnable �ӿڣ�ʵ��JAVA ���̣߳�
		
		RunnableThread runnableThread=new RunnableThread();
		
		Thread thread1 = new Thread (runnableThread,"��1");
		Thread thread2 = new Thread (runnableThread,"��2");
		Thread thread3 = new Thread (runnableThread,"��3");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
