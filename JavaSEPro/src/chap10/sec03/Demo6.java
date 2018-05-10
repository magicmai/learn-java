package chap10.sec03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo6 {
	
	public static void bufferStream() throws Exception {
		// 定义了一个带缓冲的字节输入流
		BufferedInputStream bfis = new BufferedInputStream(new FileInputStream("D://Java//notes2.pdf"));
		// 定义一个带缓冲的字节输出流
		BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("F://notes2.pdf"));
		int b = 0;
		
		long startTime = System.currentTimeMillis();  // 开始时间
		while ((b=bfis.read()) != -1) {
			bfos.write(b);
		}
		bfis.close();
		bfos.close();
		long endTime = System.currentTimeMillis();  // 结束时间
		System.out.println("缓冲花费的时间是："+(endTime - startTime)+"毫秒");
	}

	/**
	 * 非缓冲
	 * @throws Exception
	 */
	public static void stream() throws Exception {
		// 定义一个输入流
		InputStream inputStream = new FileInputStream("D://Java//notes1.pdf");
		OutputStream outputStream = new FileOutputStream("F://notes1.pdf");
		int b = 0;
		
		long startTime = System.currentTimeMillis();  // 开始时间
		while ((b=inputStream.read()) != -1) {
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();  // 结束时间
		System.out.println("非缓冲花费的时间是："+(endTime - startTime)+"毫秒");
	}
	
	public static void main(String[] args) throws Exception {
		stream();
		bufferStream();
	}
}
