package javatutorials.scope;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v); //�ν��Ͻ� ���� v�� �����ҷ��� this�� ����ϸ� �ȴ�.
	}
}

public class ScopeDemo5 {
	public static void main(String[] args) {
		C3 c3 = new C3();
		c3.m();
	}
}
