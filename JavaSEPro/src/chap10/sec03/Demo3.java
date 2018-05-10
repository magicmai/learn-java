package chap10.sec03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		File file = new File("D://Java//test.txt");
		InputStream inputStream = new FileInputStream(file);  // 实例化FileInputStream
		
		int fileLength = (int) file.length();
		byte b[] = new byte[fileLength];
		
		int temp = 0;
		int len = 0;
		while ((temp=inputStream.read()) != -1) {
			// 一个字节一个字节读取，放到b字节数组里
			b[len++] = (byte) temp;
		}
		
		inputStream.close();  // 关闭输入流
		System.out.println("读取到的内容：\n"+new String(b));
	}
}
