package javatutorials.polymorphism;

class O {
	public void a(int param) {
		System.out.println("�������");
		System.out.println(param);
	}
	public void a(String param) { //�޼ҵ� �����ε�
		System.out.println("�������");
		System.out.println(param);
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(10);
		o.a("coding");
		//���� �޼ҵ� �̸������� ���� �ٸ� ���� ��� ==> �����ε��� �������� �� ���̴�.
	}
}
