package class_test;

public class Main_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new ZHANG_ty("����һ",28,'��');
		Person p2 = new LI_sisi("��÷",25,'Ů');
		North_Person p3 = new ZHANG_ty("����һ",28,'��');
		South_Person p4 = new LI_sisi("��÷",25,'Ů');
		
		System.out.println("p1 �����Ϣ��");
        new Main_Test().habit_common(p1);
        System.out.println("________________________________");
        
        System.out.println("p2 �����Ϣ��");
        new Main_Test().habit_common(p2);
        System.out.println("________________________________");
        
        System.out.println("p3 �����Ϣ��");
        new Main_Test().habit_north(p3);
        System.out.println("________________________________");
        
        System.out.println("p4 �����Ϣ��");
        new Main_Test().habit_sorth(p4);

	}

	void habit_common(Person p) {

		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		p.eat();
		p.drink();
	}

	void habit_north(North_Person p) {

		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		p.eat();
		p.drink();
		p.raid();

	}

	void habit_sorth(South_Person p) {

		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		p.eat();
		p.drink();
		p.swim();

	}
}
