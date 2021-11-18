package javatutorials.abstractclass;

abstract class A {
	public abstract int b(); //추상 메소드 -> 메소드의 시그니처만 정의되어 있고 메소드의 구현은 하위 클래스에서 오버라이딩 해야 함
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
//	public abstract int c() {
//		System.out.println("hello");
//	}
	// 추상 클래스 내에는 추상메소드가 아닌 메소드가 존재할 수 있다.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() {return 1;} //메소드 오버라이딩
}

public class AbstractDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.b());
	}

}
