package javatutorials.io;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.hasNextInt()�� �Է°��� int���� �ƴϸ� false�� �����ϰ� �������� ���� true�� �����Ѵ�. 
		//�� �ڵ�� ����ڰ� �Է��� �� �� ���� ������ ��ٸ��ٰ� �Է��� �Ͼ�� �ݺ����� �����Ѵ�.
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
	}
}
