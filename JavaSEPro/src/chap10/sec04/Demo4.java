package chap10.sec04;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://Java//test.txt");
		Writer out = new FileWriter(file, true);  // true--追加
		String str = "--我也是。";
		out.write(str);  // 将字符串写入输出流
		out.close();  // 关闭输出流
	}
}
