package class_test;

abstract public class Person {

// ������

	String name;
	int age;
	char sex;

// �๹�췽��

	Person() {
	};

	Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

// �෽��

	abstract void eat();

	abstract void drink();
	
	void work() {
		System.out.println("ÿ��8Сʱ�ϰ࣡");
	}

}
