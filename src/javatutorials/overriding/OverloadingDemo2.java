package javatutorials.overriding;

public class OverloadingDemo2 extends OverloadingDemo{
	void A(String arg1, String arg2) {System.out.println("void A(String arg1, String arg2)");} //메소드 오버로딩
	void A() {System.out.println("void A() sub class");} //메소드 오버라이딩(부모 클래스에 인자값이 없는 메소드 A 존재 ==> 자식클래스에서 재정의)
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(null, null);
	}
}
