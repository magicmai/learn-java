package chap10.sec03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo6 {
	
	public static void bufferStream() throws Exception {
		// ������һ����������ֽ�������
		BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("D://Java//notes2.pdf"));
		// ����һ����������ֽ������
		BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("F://notes2.pdf"));
		int b = 0;
		
		long startTime = System.currentTimeMillis();  // ��ʼʱ��
		while ((b=bfis.read()) != -1) {
			bfos.write(b);
		}
		bfis.close();
		bfos.close();
		long endTime = System.currentTimeMillis();  // ����ʱ��
		System.out.println("���廨�ѵ�ʱ���ǣ�"+(endTime - startTime)+"����");
	}

	/**
	 * �ǻ���
	 * @throws Exception
	 */
	public static void stream() throws Exception {
		// ����һ��������
		InputStream inputStream = new FileInputStream("D://Java//notes1.pdf");
		OutputStream outputStream = new FileOutputStream("F://notes1.pdf");
		int b = 0;
		
		long startTime = System.currentTimeMillis();  // ��ʼʱ��
		while ((b=inputStream.read()) != -1) {
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();  // ����ʱ��
		System.out.println("�ǻ��廨�ѵ�ʱ���ǣ�"+(endTime - startTime)+"����");
	}
	
	public static void main(String[] args) throws Exception {
		stream();
		bufferStream();
	}
}
