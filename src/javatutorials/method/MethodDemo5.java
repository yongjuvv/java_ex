package javatutorials.method;

public class MethodDemo5 {
	public static String numbering(int init, int limit) { //메소드의 리턴값이 String임을 명시, 반환값이 없으면 void
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
