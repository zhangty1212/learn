package synax_test;

import java.util.Scanner;

public class if_test {

	public static void main(String[] args) {

		new if_test().if1();

		new if_test().if2();
	}

	// if �Z�䵥��ѭ��
	void if1() {

		if ("zhangtaoyi".length() > "123456789".length()) {
			System.out.println("name_length: " + "zhangtaoyi".length());
		} else {
			System.out.println("number_length: " + "123456789".length());
		}

	}

	// if �Z����ѭ��
	void if2() {

		double a = 0.0;
		
		// ��ȡ��Ļ������Ϣ
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ɼ���");
		
		if (scanner.hasNextDouble()) {
			a = scanner.nextDouble();
			if (0 <= a && a < 60) {
				System.out.println("�ɼ�������" + String.format("%.2f", a));
			} else if (60 < a && a <= 75) {
				System.out.println("�ɼ�����" + String.format("%.2f", a));
			} else if (75 < a && a <= 100) {
				System.out.println("�ɼ����죺" + String.format("%.2f", a));
			} else {
				System.out.println("�ɼ������������������룺" + a);
			}

		} else {
			// ����������Ϣ
			System.out.println("����Ĳ������֣����������룡");
		}

	}

}
