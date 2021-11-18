package javatutorials.object;

public class CalculatorDemo {
	public static void sum(int left, int right) {
		int result = left + right;
		System.out.println(result);
	}
	
	public static void avg(int left, int right) {
		int result = (left + right) /2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		sum(10,20);
		sum(20,40);
		
		avg(20,40);
	}
}
