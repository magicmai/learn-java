package chap02.sec05;

public class Demo8 {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i==1){
					return;
				}
				System.out.print("i="+i+" j="+j+" ");
			}
			System.out.println("---");
		}
		
		System.out.println("ִ�е������ˣ�");
		
	}
}