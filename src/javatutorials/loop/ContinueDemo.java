package javatutorials.loop;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) continue; 
			//continue는 이 명령이 나타나는 이후의 로직을 실행하지 않도록 한다
			System.out.println("coding, i = " + i);
		}
	}
}
