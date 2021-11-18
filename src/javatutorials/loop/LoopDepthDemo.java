package javatutorials.loop;

public class LoopDepthDemo {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5; i++) {
			System.out.println("i = " + i);
			for(int k = 0 ; k < 5 ; k++) {
				System.out.println("i = " + i + "k = " + k);
				
			}
		}
	}
}
