package collection_test;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_test {

	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<>();

		Student s1 = new Student("zhang", 28);

		Student s2 = new Student("li", 24);

		arrayList.add(s1);
		arrayList.add(s2);

		Iterator<Student> it = arrayList.iterator();
		
		new Arraylist_test().traverse(it);
		
		System.out.println("---------------------------------------------");
		
		new Arraylist_test().traverse2(arrayList);
		

	}

	// Iterator 遍历 ArrayList 元素
	
	void traverse(Iterator<Student> it) {

		while (it.hasNext()) {

			Student s = (Student)it.next();
			System.out.println(s.getName() + "-" + s.getAge());

			/*
			 * 此种写法有问题，请用上面的写法； System.out.println(it.next().getName() + "——" +
			 * it.next().getAge());
			 */

		}
	}
	
	// for循环 遍历 ArrayList 元素
	
		void traverse2(ArrayList <Student> arr) {

			 for (int x=0; x<arr.size();x++) {
				 
				Student s= arr.get(x);
				 
				System.out.println(s.getName() +"-"+s.getAge()); 
				 
			 }

			}
		}
	

