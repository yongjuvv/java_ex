package javatutorials.method;

public class ReturnDemo2 {

	public static String num(int i) {
		//return�� ����� ��ȯ�ϱ⵵ ������ �޼ҵ带 ������Ű�� ���ҵ� �Ѵ�.
		if(i == 0) {
			return "zero";
		}else if (i == 1) {
			return "one";
		}else if (i==2) {
			return "two";
		}else {
			return "out of bound";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(num(1));
	}
}
