package javatutorials.overriding;

public class OverloadingDemo {
	void A() {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
//	int A() {System.out.println("int A()");}
	//매개변수의 수가 같으면서 반환값이 다른 경우 에러가 발생함
	//오버로딩을 하기 위해서는 메소드 이름이 같아야 하며 매개변수의 수가 달라야 하며 반환값이 같아야 한다. 
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("coding");
	}
}
