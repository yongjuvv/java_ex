package javatutorials.scope;

class C2 {
	int v = 10;
	
	void m() {
		int v = 20; //지역변수는 전역변수보다 우선순위가 높음
		System.out.println(v); //결과 20
	}
}

public class ScopeDemo3 {
	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m();
	}
}
