package chap02.sec06;

public class Demo2 {

	public static void main(String[] args) {
		// ����һ�����飬���Ҿ�̬��ʼ��
		int arr[] = new int[]{1, 2, 3};
		
		// ��ͨ�ı������鷽ʽ
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n---------------");
		
		// foreach������������
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}
}
