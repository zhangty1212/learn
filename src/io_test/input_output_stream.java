package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class input_output_stream {

	public static void main(String[] args) throws IOException {

		// 字节流学习
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\25472\\Desktop\\a1.txt");
		File f_copy1 = new File("C:\\Users\\25472\\Desktop\\a21.txt");
		File f_copy2 = new File("C:\\Users\\25472\\Desktop\\a22.txt");

		// 基本字节流 FileInputStream、 FileOutputStream 方式， 读写数据
		InputStream fin = new FileInputStream(f);
		OutputStream fout1 = new FileOutputStream(f_copy1);
		OutputStream fout2 = new FileOutputStream(f_copy2);

		// 定义一个字节数组
		byte[] b = new byte[1024];
		int len = 0;

		while ((len = fin.read(b)) != -1) {
			fout1.write(b, 0, len);
		}
		// 刷新并关闭输入、输出流
		fout1.flush();
		fout1.close();
		// 输入流 fin 暂时不要关闭，下面的BufferedInputStream、 BufferedOutputStream 还要用
		// fin.close();

		// 高效缓冲字节流， BufferedInputStream、 BufferedOutputStream 方式读写
		BufferedInputStream bfin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(fout2);

		// 定义一个字节数组
		byte[] b2 = new byte[1024];
		int len2 = 0;

		while ((len2 = bfin.read(b2)) != -1) {
			bout.write(b2, 0, len2);
		}
		bout.flush();
		bout.close();
		fin.close();
	}

}
