package chap03.sec08;

public class Demo9 {

	public static void main(String[] args) {
		String str = " aB45rfg & *  --( s99**  ";
		System.out.println("str="+str);
		// ȥ��ǰ��հ׷�
		String trimStr = str.trim();
		System.out.println("trimStr="+trimStr);
		
		int charNum = 0; 
		int numbers = 0;
		int trimNum = 0;
		int others = 0;
		
		for (int i = 0; i < trimStr.length(); i++) {
			char c = trimStr.charAt(i);
			
			if ((c>='a' && c<='z')||(c>='A' && c<='Z')) {  // �ж�Ӣ���ַ�
				charNum++;
				System.out.println("Ӣ���ַ���"+c);
			} else if (c>='0' && c<='9') {  // �ж�����
				numbers++;
				System.out.println("���֣�"+c);
			} else if (c == ' ') {  // �жϿո�
				trimNum++;
				System.out.println("�ո�"+c);
			} else {  // �����ַ�
				others++;
				System.out.println("������"+c);
			}
		}
		
		System.out.println("Ӣ���ַ�������"+charNum);
		System.out.println("����������"+numbers);
		System.out.println("�ո�������"+trimNum);
		System.out.println("�����ַ�������"+others);
	}
}
