package javatutorials.interfaces;

interface I {
	public void z() ;
}

class A implements I { //클래스 A가 인터페이스 I를 구현하고 있다는 의미 ==> 인터페이스 I가 가지고 있는 Z()메소드를 반드시 포함하고 있어야 한다.
	public void z() {};
}

public class InterfaceDemo {

}
