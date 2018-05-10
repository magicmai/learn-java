package chap10.sec04;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://Java//test.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];  //字符数组
		
		int len = 0;
		int temp = 0;
		while ((temp = reader.read()) != -1) {
			c[len++] = (char) temp;
		}
		
		reader.close();  // 关闭字符输入流
		System.out.println("读取的内容是：\n"+new String(c, 0, len));
		
	}
}
