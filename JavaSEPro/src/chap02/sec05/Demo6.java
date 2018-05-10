package chap02.sec05;

public class Demo6 {

	public static void main(String[] args) {
		outer:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i==1){
					break outer;
				}
				System.out.print("i="+i+" j="+j+" ");
			}
		}
	
		System.out.println("outer");
	}
}
