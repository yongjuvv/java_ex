package javatutorials.polymorphism;

class C {
	public String x() {
		return "C.x";
	}
}

class D extends C {
	public String x() {
		return "D.x"; //메소드 오버라이딩
	}
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		C obj = new D();
		System.out.println(obj.x()); //결과로 D가 오버라이딩한 메소드가 호출됨
		// obj는 D의 인스턴스이면서 C의 행세를 하고 있음
		// obj는 C의 행세를 하고 있기에 C에 존재하지 않는 메소드를 사용할 수 없음
		// 그러나 obj는 D의 인스턴스이기에 D가 C의 메소드를 오버라이딩 했다면 D의 메소드가 호출된다.
		// ==> 클래스 D가 클래스 C화 되었지만, obj는 D의 인스턴스이기에 클래스D의 기본적인 성질은 그대로 간직하고 있다
	}
}
