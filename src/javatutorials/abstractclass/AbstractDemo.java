package javatutorials.abstractclass;

abstract class A {
	public abstract int b(); //�߻� �޼ҵ� -> �޼ҵ��� �ñ״�ó�� ���ǵǾ� �ְ� �޼ҵ��� ������ ���� Ŭ�������� �������̵� �ؾ� ��
	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
//	public abstract int c() {
//		System.out.println("hello");
//	}
	// �߻� Ŭ���� ������ �߻�޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {return 1;} //�޼ҵ� �������̵�
}

public class AbstractDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.b());
	}

}
