package javatutorials.polymorphism;

class A {
	public String x() {
		return "A.x";
	}
}

class B extends A {
	public String x() {
		return "B.x";
	}
	
	public String y() {
		return "y";
	}
}

class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		A obj = new B();
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
//		obj.y(); obj는 클래스B의 인스턴스지만 데이터타입이 A이기에 A클래스에 존재하지 않는 y메소드를 호출할 수 없음
	}
}
