package collection_test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_test {

	public static void main(String[] args) {

		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		HashMap<String, Student> hashmap2 = new HashMap<String, Student>();
		
		hashmap2.put("214001", new Student("����",23));
		hashmap2.put("214002", new Student("����",38));
		hashmap2.put("214003", new Student("����",29));
		System.out.println(hashmap2);
		
		Set<Map.Entry<String, Student>> set2=hashmap2.entrySet();
		
		for(Map.Entry<String, Student> entry: set2) {
			
			System.out.println(entry.getKey()+"_"+entry.getValue().getName()+"_"+entry.getValue().getAge());
		}
		
		System.out.println("-------------------------------------------------");
		
		hashmap.put("213001", "����");
		hashmap.put("213002", "����");
		hashmap.put("213003", "����");
		System.out.println(hashmap);
		
		

		// �����������м�,�ٸ��ݼ�����ȡ��ֵ��

		Set<String> set = hashmap.keySet();

		for (String str : set) {

			System.out.println(str);

			// ���˼���Ҳ���ܻ�ȡ��ֵ��

			System.out.println(str+"_"+hashmap.get(str));
		}
		
		System.out.println("------------------------------------------------------");

		// ������������ֵ

		Collection<String> collection = hashmap.values();
		for (String str : collection) {
			System.out.println(str);
		}
		
		System.out.println("------------------------------------------------------");
		
		// entrySet() �������Ȼ�ȡmap��-ֵ�Ե�set���ϣ��ٱ�����ȡÿһ����-ֵ�Եġ����� �� ��ֵ��
		
		Set<Map.Entry<String,String>> entryset = hashmap.entrySet();
		 for(Map.Entry<String,String> entry:entryset) {
			 System.out.println(entry.getKey()+"_"+entry.getValue());
		 }

	}

}
