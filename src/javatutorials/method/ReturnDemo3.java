package javatutorials.method;

public class ReturnDemo3 {

	public static String[] getMembers() {
		String[] members = {"ÃÖÁøÇõ", "ÀÌÀ¯ºó", "ÇÑÀÌ¶÷" };
		return members;
	}
	public static void main(String[] args) {

		for(int i = 0; i < getMembers().length; i++) {
			System.out.println(getMembers()[i]);
		}
	}
}
