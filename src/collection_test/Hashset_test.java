package collection_test;

import java.util.HashSet;

public class Hashset_test {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("张涛一");
		hashSet.add("李四");
		hashSet.add("王五");
		hashSet.add("王五");
		hashSet.add("张涛一");

		System.out.println(hashSet);

		for (String str : hashSet) {
			System.out.println(str);
		}

		HashSet<Student> hashSet_Student = new HashSet<Student>();

		Student s1 = new Student("zhang", 28);
		Student s2 = new Student("li", 24);
		Student s3 = new Student("wu", 20);
		
		// list 类型的集合，存放的元素允许重复 ；  set 类型的集合，存放的元素不允许重复；
		// set 类型的集合，存放的元素不允许重复，依赖于 hashCode() 和 equals() 方法；
		
		/*存放自定义对象时（例如：Student），Student 类需要重写  hashCode() 和 equals() 方法，
		不然，"会重复添加对象"---我们认为姓名和年龄一样的学生，是同一个人  */
		
		Student s4 = new Student("wu", 20);
		Student s5 = new Student("zhang", 28);
		

		hashSet_Student.add(s1);
		hashSet_Student.add(s2);
		hashSet_Student.add(s3);
		
		/*存放自定义对象时（例如：Student），Student 类需要重写  hashCode() 和 equals() 方法，
		不然，"会重复添加对象"---我们认为姓名和年龄一样的学生，是同一个人； 
		
		比如：如果不重写Student 类的  hashCode() 和 equals() 方法，(S1,S5),  (S3,S4) 都会添加到 hashSet_Student
		
		 */
		
		hashSet_Student.add(s4);
		hashSet_Student.add(s5);

		System.out.println(hashSet_Student);

		for (Student stu : hashSet_Student) {

			int age = stu.getAge();
			String str = stu.getName();
			System.out.println("姓名：" + str + ";" + "年龄：" + age);
		}

	}

}
