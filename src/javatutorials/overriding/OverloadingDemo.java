package javatutorials.overriding;

public class OverloadingDemo {
	void A() {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
//	int A() {System.out.println("int A()");}
	//�Ű������� ���� �����鼭 ��ȯ���� �ٸ� ��� ������ �߻���
	//�����ε��� �ϱ� ���ؼ��� �޼ҵ� �̸��� ���ƾ� �ϸ� �Ű������� ���� �޶�� �ϸ� ��ȯ���� ���ƾ� �Ѵ�. 
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("coding");
	}
}
