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
		b = new A(2); //b가 다른 클래스로부터 인스턴스화 된 것이면 b의 값을 바꿔도 a에는 지장이 없음
		b.id = 2;
		System.out.println("runReference, " + a.id);
		//기본 데이터타입이 아닌 변수 --> 참조
		//a, b는 new A()를 참조하고 있음
		//참조하고 있는 값을, 원본 데이터를 바꾸게 되면 참조하고 있는 a,b의 값은 모두 변경된다.
	}
	public static void main(String[] args) {
		runValue();
		runReference();
	}
}
