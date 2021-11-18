package javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt(); //sc.nextint()가 실행되면 자바는 사용자의 입력이 있을 때 까지 변수 i에 값을 할당하지 않고 대기상태에 있게됨
		System.out.println(i);
		sc.close();
	}
}
