package javatutorials.polymorphism;

class C {
	public String x() {
		return "C.x";
	}
}

class D extends C {
	public String x() {
		return "D.x"; //�޼ҵ� �������̵�
	}
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		C obj = new D();
		System.out.println(obj.x()); //����� D�� �������̵��� �޼ҵ尡 ȣ���
		// obj�� D�� �ν��Ͻ��̸鼭 C�� �༼�� �ϰ� ����
		// obj�� C�� �༼�� �ϰ� �ֱ⿡ C�� �������� �ʴ� �޼ҵ带 ����� �� ����
		// �׷��� obj�� D�� �ν��Ͻ��̱⿡ D�� C�� �޼ҵ带 �������̵� �ߴٸ� D�� �޼ҵ尡 ȣ��ȴ�.
		// ==> Ŭ���� D�� Ŭ���� Cȭ �Ǿ�����, obj�� D�� �ν��Ͻ��̱⿡ Ŭ����D�� �⺻���� ������ �״�� �����ϰ� �ִ�
	}
}
