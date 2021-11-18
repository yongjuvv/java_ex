package javatutorials.io;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.hasNextInt()는 입력값이 int형이 아니면 false를 리턴하고 숫자형인 경우는 true를 리턴한다. 
		//이 코드는 사용자가 입력을 할 때 까지 실행을 기다리다가 입력이 일어나면 반복문이 동작한다.
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
	}
}
