package javatutorials.method;

public class MethodDemo5 {
	public static String numbering(int init, int limit) { //�޼ҵ��� ���ϰ��� String���� ���, ��ȯ���� ������ void
		int i = init;
		String output = "";
		while(i<limit) {
			output += i;
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		String result = numbering(0, 5);
		System.out.println(result);
	}
}
