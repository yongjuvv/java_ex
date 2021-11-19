package javatutorials.polymorphism;

class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) { //메소드 오버로딩
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(10);
		o.a("coding");
		//같은 메소드 이름이지만 서로 다른 동작 방법 ==> 오버로딩은 다형성의 한 예이다.
	}
}
