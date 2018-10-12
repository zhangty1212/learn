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

		// �ֽ���ѧϰ
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\25472\\Desktop\\a1.txt");
		File f_copy1 = new File("C:\\Users\\25472\\Desktop\\a21.txt");
		File f_copy2 = new File("C:\\Users\\25472\\Desktop\\a22.txt");

		// �����ֽ��� FileInputStream�� FileOutputStream ��ʽ�� ��д����
		InputStream fin = new FileInputStream(f);
		OutputStream fout1 = new FileOutputStream(f_copy1);
		OutputStream fout2 = new FileOutputStream(f_copy2);

		// ����һ���ֽ�����
		byte[] b = new byte[1024];
		int len = 0;

		while ((len = fin.read(b)) != -1) {
			fout1.write(b, 0, len);
		}
		// ˢ�²��ر����롢�����
		fout1.flush();
		fout1.close();
		// ������ fin ��ʱ��Ҫ�رգ������BufferedInputStream�� BufferedOutputStream ��Ҫ��
		// fin.close();

		// ��Ч�����ֽ����� BufferedInputStream�� BufferedOutputStream ��ʽ��д
		BufferedInputStream bfin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(fout2);

		// ����һ���ֽ�����
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
