package chap02.sec05;

public class Demo3 {
	
	public static void main(String[] args) {
		// �ڿ���̨���1��10
		
		// while ѭ�����
		int i = 1;
		while (i<11) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("\n--------------------");
		
		// do...while ѭ�����
		int j = 1;
		do {
			System.out.print(j+" ");
			j++;
		} while(j<11);
		
		// while �� do...while ������
		// while �����жϺ�ִ�У�
		// do...while ����ִ�к��ж�.
		
		System.out.println("\n--------------------");
		
		// for ѭ��
		for(int k=1;k<11;k++){
			System.out.print(k+" ");
		}
		
		System.out.println("\n--------------------");
		
		// for ѭ����Ƕ��
		for(int m=0;m<5;m++){
			for(int n=0;n<5;n++){
				System.out.println("m="+m+" n="+n);
			}
		}
	}
}