package javatutorials.accessmodifier;

class A {
	public String y() {
		return "public void y()";
	}
	//private�� Ŭ���� �ۿ����� ������ �� ���ٴ� �ǹ�
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}
public class AccessDemo1 {
public static void main(String[] args) {
	A a = new A();
	System.out.println(a.y());
//	System.out.println(a.z());
	//z()�� private�̱⿡ Ŭ���� �ۿ��� ����� �� ����
	System.out.println(a.x());
}
}
