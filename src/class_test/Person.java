package class_test;

abstract public class Person {

// 类属性

	String name;
	int age;
	char sex;

// 类构造方法

	Person() {
	};

	Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

// 类方法

	abstract void eat();

	abstract void drink();
	
	void work() {
		System.out.println("每天8小时上班！");
	}

}
