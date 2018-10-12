package collection_test;

import java.util.HashSet;

public class Hashset_test {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("����һ");
		hashSet.add("����");
		hashSet.add("����");
		hashSet.add("����");
		hashSet.add("����һ");

		System.out.println(hashSet);

		for (String str : hashSet) {
			System.out.println(str);
		}

		HashSet<Student> hashSet_Student = new HashSet<Student>();

		Student s1 = new Student("zhang", 28);
		Student s2 = new Student("li", 24);
		Student s3 = new Student("wu", 20);
		
		// list ���͵ļ��ϣ���ŵ�Ԫ�������ظ� ��  set ���͵ļ��ϣ���ŵ�Ԫ�ز������ظ���
		// set ���͵ļ��ϣ���ŵ�Ԫ�ز������ظ��������� hashCode() �� equals() ������
		
		/*����Զ������ʱ�����磺Student����Student ����Ҫ��д  hashCode() �� equals() ������
		��Ȼ��"���ظ���Ӷ���"---������Ϊ����������һ����ѧ������ͬһ����  */
		
		Student s4 = new Student("wu", 20);
		Student s5 = new Student("zhang", 28);
		

		hashSet_Student.add(s1);
		hashSet_Student.add(s2);
		hashSet_Student.add(s3);
		
		/*����Զ������ʱ�����磺Student����Student ����Ҫ��д  hashCode() �� equals() ������
		��Ȼ��"���ظ���Ӷ���"---������Ϊ����������һ����ѧ������ͬһ���ˣ� 
		
		���磺�������дStudent ���  hashCode() �� equals() ������(S1,S5),  (S3,S4) ������ӵ� hashSet_Student
		
		 */
		
		hashSet_Student.add(s4);
		hashSet_Student.add(s5);

		System.out.println(hashSet_Student);

		for (Student stu : hashSet_Student) {

			int age = stu.getAge();
			String str = stu.getName();
			System.out.println("������" + str + ";" + "���䣺" + age);
		}

	}

}
