package chap03.sec08;

public class Demo6 {

	public static void main(String[] args) {
		// indexOf() ����ʾ��
		String str = "qwpertyuiopaaa";
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã�"+str.indexOf('p'));
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã�������4��ʼ��"+str.indexOf("p", 4));
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã������ʼ����"+str.lastIndexOf("p"));
	}
}
