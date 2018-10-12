package io_test;

import java.io.File;

public class file_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\25472\\Desktop\\1\\2\\3\\");
		File f2 = new File("C:\\Users\\25472\\Desktop\\11\\22\\33\\");
		File f3 = new File("C:\\Users\\25472\\Desktop\\1");

		new file_test().digui(f3);
		
		/*
		 * String[] str = f.list(); for (String string : str) { //
		 * System.out.println(string); if (string.endsWith(".docx")) {
		 * System.out.println(string); } }
		 */

		/*
		 * if(!f2.exists()) { f2.mkdirs(); }
		 * 
		 * String[] str2 = f2.list(); for (String string : str2) {
		 * System.out.println(string); }
		 */

	}
	
	// 递归遍历一个文件夹下的所有文件

	void digui(File ff) {

		File[] f = ff.listFiles();

		for (File fs : f) {

			if (fs.isDirectory()) {

				digui(fs);

			} else {
				System.out.println(fs.getName());
			}
		}
	}
}