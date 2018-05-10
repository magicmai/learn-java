package chap03.sec08;

public class Demo6 {

	public static void main(String[] args) {
		// indexOf() 方法示例
		String str = "qwpertyuiopaaa";
		System.out.println("d在字符串str中第一次出现的索引位置："+str.indexOf('p'));
		System.out.println("d在字符串str中第一次出现的索引位置，从索引4开始："+str.indexOf("p", 4));
		System.out.println("d在字符串str中第一次出现的索引位置，从最后开始数："+str.lastIndexOf("p"));
	}
}
