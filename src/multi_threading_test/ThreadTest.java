package multi_threading_test;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//（1）方法说明： 通过继承 Thread 类，实现JAVA 多线程；
		
		// 代码为什么有问题，跑起来？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？
		
		//  通过继承 Thread 类，实现JAVA 多线程,有问题；  建议使用实现Runnable 接口的方式，来实现多线程。
		
	
		
		MyThread thread1 = new MyThread();	
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		
		thread1.setName("售票窗口1");
		thread2.setName("售票窗口2");
		thread3.setName("售票窗口3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
