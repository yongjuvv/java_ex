package javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int i = sc.nextInt(); //sc.nextint()�� ����Ǹ� �ڹٴ� ������� �Է��� ���� �� ���� ���� i�� ���� �Ҵ����� �ʰ� �����¿� �ְԵ�
		System.out.println(i);
		sc.close();
	}
}
