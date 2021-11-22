package javatutorials.reference;

public class ReferenceParameterDemo {
	static void _value(int b) { //int b = a;
		b = 2;
	}
	public static void runValue() {
		int a = 1;
		_value(a);
		//a는 기본데이터 타입(int)이기에 값이 변화하지 않는다.
		System.out.println("runValue, " +a);
	}
	static void _reference1(A b) { //A b = a;
		b = new A(1); //변수 b는 new A(2)를 참조하고 있음, id = 2
	}
	public static void runReference1() {
		A a = new A(1); //new A(1)참조, id는 1
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	static void _reference2(A b) { //A b = a A라는 데이터타입을 가지고 있는 인스턴스 b는 인스턴스 a를 참조한다.
		b.id = 2; //a와 b는 같은 인스턴스를 참조하고 있음, b의 id값을 바꾸면 a의 id값도 동일하게 달라짐 (참조!!!)
	}
	public static void runReference2(){
        A a = new A(1); //A라는 데이터타입의 인스턴스 a는 1이라는 값을 새로운 A데이터타입의 인스턴스를 생성한다. 
        _reference2(a);
        System.out.println("runReference2, "+a.id);     
    }
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
