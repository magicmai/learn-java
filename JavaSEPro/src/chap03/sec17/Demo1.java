package chap03.sec17;

public class Demo1 {

	public static void main(String[] args) {
		int a = 1;
		Integer i = new Integer(a);  // װ�䣬�ѻ���������ɶ������
		int b = i.intValue();  // ���䣬�Ѷ��������ɻ�������
		System.out.println("a="+a+" i="+i+" b="+b);
	}
}
