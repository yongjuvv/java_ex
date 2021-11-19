package javatutorials.polymorphism;

interface I2{
	public String A();
}
interface I3{
	public String B();
}


class F implements I2, I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
	
}

public class PolymorphismDemo5 {
	public static void main(String[] args) {
		F obj = new F();
		I2 objI2 = new F();
		I3 objI3 = new F();
		
		System.out.println(obj.A());
		System.out.println(obj.B());
		
		System.out.println(objI2.A());
//		objI2.B(); 
		//I2를 데이터타입으로 하고 있기에 I2에서 정의하지 않은 메소드를 사용할 수 없음
		//데이터타입을 인터페이스로 주게 되면, 그 인터페이스에서 정의된 메소드만 사용할 수 있게 됨
	}
}
