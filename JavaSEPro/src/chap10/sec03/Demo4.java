package chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D://Java//test.txt");
		
		OutputStream out = new FileOutputStream(file);
		
		String str = "How do you do?";
		byte b[] = str.getBytes();
		out.write(b);  // 将b字节数组写入到输出流
		out.close();   // 关闭时输出流
		
	}
}
