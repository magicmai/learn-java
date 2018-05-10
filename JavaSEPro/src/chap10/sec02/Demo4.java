package chap10.sec02;

import java.io.File;

public class Demo4 {

	/**
	 * 打印文件!
	 * @param file
	 */
	public static void listFile(File file) {
		if (file != null) {
			if (file.isDirectory()) {  // 是目录
				File f[] = file.listFiles();  // 遍历目录
				if (f != null) {
					for(int i=0;i<f.length;i++) {
						listFile(f[i]);
					}
				}
			} else {  // 是文件
				System.out.println(file);  // 直接打印文件路径
			}
		}
	}
	
	public static void main(String[] args) {
		File file = new File("D://Java//J2SE");
		listFile(file);
				
	}
}
