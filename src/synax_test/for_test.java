package synax_test;

public class for_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new for_test().for1();
		System.out.println("-------------------------------------");
	//	new for_test().for2();
		System.out.println("-------------------------------------");
		new for_test().chengfa_99();
		System.out.println("-------------------------------------");
		new for_test().sanjiao();
	}

	// ����forѭ�h�Z��
	void for1() {

		int[] a = { 1, 2, 3, 4, 5 };

		for (int l = 0; l < a.length; l++) {
			System.out.println(a[l]);
		}
	}

	// ��ǿfor ѭ�h�Z��

	void for2() {
		int[] a = { 1, 2, 3, 4, 5 };

		for (int num : a) {
			if (num < 3 || num > 4)
				System.out.println(num);
		}
	}

	// Ƕ��for ѭ�h
	// 99 �˷���
	void chengfa_99() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println("");
		}

	}

	// ���x����

	void sanjiao() {

		int rows = 10;

		for (int i = 0; i < rows; i++) {
			int number = 1;
			// ��ӡ�ո��ַ���
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
