package chap10.sec03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D://Java//test.txt");
		
		OutputStream out = new FileOutputStream(file, true);  // 加入参数 true，追加数据，不覆盖
		
		String str = "How do you do?";
		byte b[] = str.getBytes();
		out.write(b);  // 将b字节数组写入到输出流
		out.close();   // 关闭时输出流
		
	}
}
