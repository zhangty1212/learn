package synax_test;

import java.util.Scanner;

public class if_test {

	public static void main(String[] args) {

		new if_test().if1();

		new if_test().if2();
	}

	// if 語句单次循环
	void if1() {

		if ("zhangtaoyi".length() > "123456789".length()) {
			System.out.println("name_length: " + "zhangtaoyi".length());
		} else {
			System.out.println("number_length: " + "123456789".length());
		}

	}

	// if 語句多次循环
	void if2() {

		double a = 0.0;
		
		// 获取屏幕输入信息
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入成绩：");
		
		if (scanner.hasNextDouble()) {
			a = scanner.nextDouble();
			if (0 <= a && a < 60) {
				System.out.println("成绩不及格：" + String.format("%.2f", a));
			} else if (60 < a && a <= 75) {
				System.out.println("成绩及格：" + String.format("%.2f", a));
			} else if (75 < a && a <= 100) {
				System.out.println("成绩优异：" + String.format("%.2f", a));
			} else {
				System.out.println("成绩输入有误，请重新输入：" + a);
			}

		} else {
			// 输出错误的信息
			System.out.println("输入的不是数字，请重新输入！");
		}

	}

}
