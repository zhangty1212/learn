package synax_test;

import java.util.Arrays;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Array_test().Array_sort1();
		new Array_test().Array_sort2();
	}

	// �������Դ�����
	void Array_sort1() {

		int[] a = { 33, 45, 21, 66, 23 };
		int[] b = new int[a.length];
		Arrays.sort(a);

		for (int num : a) {
			System.out.println(num);
		}
	}

	// �Լ���д����

	void Array_sort2() {

		int[] a = { 33, 45, 21, 66, 23 };
		for (int i = 0; i < a.length - 1; i++) {
			// ����Ǻ͵�һ�����ıȽϵ���
			for (int j = i + 1; j < a.length; j++) {
				// ����һ����ʱ�ı�����������������
				int temp;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int num : a) {
			System.out.println(num);
		}

	}

}
