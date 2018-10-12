package multi_threading_test;

public class RunnableThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//（2）方法说明： 通过实现 Runnable 接口，实现JAVA 多线程；
		
		RunnableThread runnableThread=new RunnableThread();
		
		Thread thread1 = new Thread (runnableThread,"窗1");
		Thread thread2 = new Thread (runnableThread,"窗2");
		Thread thread3 = new Thread (runnableThread,"窗3");
		
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
