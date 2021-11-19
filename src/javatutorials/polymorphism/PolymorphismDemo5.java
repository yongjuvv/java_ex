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
		//I2�� ������Ÿ������ �ϰ� �ֱ⿡ I2���� �������� ���� �޼ҵ带 ����� �� ����
		//������Ÿ���� �������̽��� �ְ� �Ǹ�, �� �������̽����� ���ǵ� �޼ҵ常 ����� �� �ְ� ��
	}
}
