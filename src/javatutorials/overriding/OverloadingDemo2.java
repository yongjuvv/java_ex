package javatutorials.overriding;

public class OverloadingDemo2 extends OverloadingDemo{
	void A(String arg1, String arg2) {System.out.println("void A(String arg1, String arg2)");} //�޼ҵ� �����ε�
	void A() {System.out.println("void A() sub class");} //�޼ҵ� �������̵�(�θ� Ŭ������ ���ڰ��� ���� �޼ҵ� A ���� ==> �ڽ�Ŭ�������� ������)
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(null, null);
	}
}
