package chap03.sec10;

public class Test extends People {
	
	private int a = 1;
//	private final int a = 1;

	public void action() {
		a = 2;
		System.out.println("做一个坏人！");
	}
	
	public static void main(String[] args) {
		System.out.println(Common.THETITLE);
	}
}
