package chap02.sec04;

public class Demo4 {

	public static void main(String[] args) {
		// && �룺����false�ͷ���false�����ټ������
		boolean b1 = (5>6) && (5>4);
		System.out.println("b1=" + b1);
		
		// & ����·�룬��ʹǰ���д��������ҲҪ�������ȫ��
		boolean b2 = (5<3) & (5>4);
		System.out.println("b2=" + b2);
		
		// һ�㶼�� && ��·��
		// ԭ��Ч�ʸ�
		
		// || ������true�ͷ���true
		boolean b3 = (2>3) || (3<4);
		System.out.println("b3="+b3);
		
		// | ����·��
		boolean b4 = (2>3) | (3<4);
		System.out.println("b4="+b4);
		
		// ! ��
		boolean b5 = !(2>5);
		System.out.println("b5="+b5);
		
		// ^ ��򣬵���������������ͬʱ������true
		boolean b6 = (5>4)^(4>5);
		System.out.println("b6="+b6);
	}
}
