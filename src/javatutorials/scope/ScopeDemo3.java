package javatutorials.scope;

class C2 {
	int v = 10;
	
	void m() {
		int v = 20; //���������� ������������ �켱������ ����
		System.out.println(v); //��� 20
	}
}

public class ScopeDemo3 {
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m();
	}
}
