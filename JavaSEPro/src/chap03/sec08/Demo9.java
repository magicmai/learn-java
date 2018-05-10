package chap03.sec08;

public class Demo9 {

	public static void main(String[] args) {
		String str = " aB45rfg & *  --( s99**  ";
		System.out.println("str="+str);
		// 去掉前后空白符
		String trimStr = str.trim();
		System.out.println("trimStr="+trimStr);
		
		int charNum = 0; 
		int numbers = 0;
		int trimNum = 0;
		int others = 0;
		
		for (int i = 0; i < trimStr.length(); i++) {
			char c = trimStr.charAt(i);
			
			if ((c>='a' && c<='z')||(c>='A' && c<='Z')) {  // 判断英文字符
				charNum++;
				System.out.println("英文字符："+c);
			} else if (c>='0' && c<='9') {  // 判断数字
				numbers++;
				System.out.println("数字："+c);
			} else if (c == ' ') {  // 判断空格
				trimNum++;
				System.out.println("空格："+c);
			} else {  // 其他字符
				others++;
				System.out.println("其它："+c);
			}
		}
		
		System.out.println("英文字符总数："+charNum);
		System.out.println("数字总数："+numbers);
		System.out.println("空格总数："+trimNum);
		System.out.println("其它字符总数："+others);
	}
}
