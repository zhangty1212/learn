package io_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class char_stream_test {

	public static void main(String[] args) throws IOException {

		// 字符流学习测试
		// 字符流，只适用于读取文本文件，不适用于图片、视频类文件的读取
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\25472\\Desktop\\a1.txt");
		File f_copy = new File("C:\\Users\\25472\\Desktop\\a11.txt");

		BufferedReader bre = new BufferedReader(new FileReader(f));
		BufferedWriter bwi = new BufferedWriter(new FileWriter(f_copy));

		String line = null;

		while ((line = bre.readLine()) != null) {
			bwi.write(line);
			bwi.newLine();
			bwi.flush();
		}
		bwi.close();
	}
}