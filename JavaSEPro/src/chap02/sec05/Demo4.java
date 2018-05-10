package chap02.sec05;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("100~999内的水仙花数：");
		for(int i=100;i<=999;i++){
			// 求出百位数
			int b=i/100;
			
			// 求出十位数
			int s=(i-b*100)/10;
			
			// 求出个位数
			// int g=(i-b*100)%10;
			int g=i-b*100-s*10;
			
			if(i == g*g*g + s*s*s + b*b*b){
				System.out.print(i+" ");
			}
		}
		
	}
}
