package multi_threading_test;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��1������˵���� ͨ���̳� Thread �࣬ʵ��JAVA ���̣߳�
		
		// ����Ϊʲô�����⣬����������������������������������������������������������������������������
		
		//  ͨ���̳� Thread �࣬ʵ��JAVA ���߳�,�����⣻  ����ʹ��ʵ��Runnable �ӿڵķ�ʽ����ʵ�ֶ��̡߳�
		
	
		
		MyThread thread1 = new MyThread();	
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		
		thread1.setName("��Ʊ����1");
		thread2.setName("��Ʊ����2");
		thread3.setName("��Ʊ����3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
