package collection_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_test {

	public static void main(String[] args) {

		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		HashMap<String, Student> hashmap2 = new HashMap<String, Student>();
		
		hashmap2.put("214001", new Student("张三",23));
		hashmap2.put("214002", new Student("李四",38));
		hashmap2.put("214003", new Student("王五",29));
		System.out.println(hashmap2);
		
		Set<Map.Entry<String, Student>> set2=hashmap2.entrySet();
		
		for(Map.Entry<String, Student> entry: set2) {
			
			System.out.println(entry.getKey()+"_"+entry.getValue().getName()+"_"+entry.getValue().getAge());
		}
		
		System.out.println("-------------------------------------------------");
		
		hashmap.put("213001", "张三");
		hashmap.put("213002", "李四");
		hashmap.put("213003", "王五");
		System.out.println(hashmap);
		
		

		// 单独遍历所有键,再根据键，获取到值；

		Set<String> set = hashmap.keySet();

		for (String str : set) {

			System.out.println(str);

			// 有了键，也就能获取到值了

			System.out.println(str+"_"+hashmap.get(str));
		}
		
		System.out.println("------------------------------------------------------");

		// 单独遍历所有值

		Collection<String> collection = hashmap.values();
		for (String str : collection) {
			System.out.println(str);
		}
		
		System.out.println("------------------------------------------------------");
		
		// entrySet() 方法，先获取map键-值对的set集合，再遍历获取每一个键-值对的“键” 和 “值”
		
		Set<Map.Entry<String,String>> entryset = hashmap.entrySet();
		 for(Map.Entry<String,String> entry:entryset) {
			 System.out.println(entry.getKey()+"_"+entry.getValue());
		 }

	}

}
