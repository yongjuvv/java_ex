package javatutorials.method;

public class MethodDemo3 {
	//limit : �Ű�����(parameter)
	
	public static void numbering(int limit) {
		int i = 0;
		while(i<limit) {
			System.out.println("i = " +i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		numbering(5);
	}
}
