package synax_test;

import java.util.Arrays;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Array_test().Array_sort1();
		new Array_test().Array_sort2();
	}

	// 数组类自带排序
	void Array_sort1() {

		int[] a = { 33, 45, 21, 66, 23 };
		int[] b = new int[a.length];
		Arrays.sort(a);

		for (int num : a) {
			System.out.println(num);
		}
	}

	// 自己手写排序

	void Array_sort2() {

		int[] a = { 33, 45, 21, 66, 23 };
		for (int i = 0; i < a.length - 1; i++) {
			// 这个是和第一个数的比较的数
			for (int j = i + 1; j < a.length; j++) {
				// 定义一个临时的变量，用来交换变量
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
