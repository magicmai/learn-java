package chap10.sec02;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("d://java//java�������ļ�.txt");
		if (file.exists()) {  // �����ļ�����
			boolean b = file.delete();  // ɾ���ļ�
			if (b) {
				System.out.println("ɾ���ļ��ɹ�");
			} else {
				System.out.println("ɾ���ļ�ʧ��");
			}
		}
		
		file = new File("d://java//java������Ŀ¼");
		if (file.exists()) {  // ����Ŀ¼����
			boolean b = file.delete();  // ɾ��Ŀ¼
			if (b) {
				System.out.println("ɾ��Ŀ¼�ɹ�");
			} else {
				System.out.println("ɾ��Ŀ¼ʧ��");
			}
		}
		
	}
}
