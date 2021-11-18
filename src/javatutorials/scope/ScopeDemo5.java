package javatutorials.scope;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v); //인스턴스 변수 v에 접근할려면 this를 사용하면 된다.
	}
}

public class ScopeDemo5 {
	public static void main(String[] args) {
		C3 c3 = new C3();
		c3.m();
	}
}
