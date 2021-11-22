package javatutorials.reference;

class A {
	public int id;
	A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo1 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b = new A(2); //b�� �ٸ� Ŭ�����κ��� �ν��Ͻ�ȭ �� ���̸� b�� ���� �ٲ㵵 a���� ������ ����
		b.id = 2;
		System.out.println("runReference, " + a.id);
		//�⺻ ������Ÿ���� �ƴ� ���� --> ����
		//a, b�� new A()�� �����ϰ� ����
		//�����ϰ� �ִ� ����, ���� �����͸� �ٲٰ� �Ǹ� �����ϰ� �ִ� a,b�� ���� ��� ����ȴ�.
	}
	public static void main(String[] args) {
		runValue();
		runReference();
	}
}
