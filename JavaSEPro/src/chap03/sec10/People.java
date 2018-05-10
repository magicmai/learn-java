package chap03.sec10;

public class People {

	public void action() {
		System.out.println("做一个良好的公民！");
	}
	
	// 使用 final 声明的方法不能被子类覆盖
	public final void action2() {
		System.out.println("做一个良好的公民！");
	}
}
