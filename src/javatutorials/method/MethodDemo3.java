package javatutorials.method;

public class MethodDemo3 {
	//limit : 매개변수(parameter)
	
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
