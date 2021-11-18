package javatutorials.scope;

public class ScopeDemo {
	static void a() {
		int i = 0; //변수 i는 메소드 a에 소속된 변수임. 변수의 값을 어떻게 바꿔도 메소드 밖에서는 영향을 주지 않음
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5 ; i++) {
			a();
			System.out.println(i);
		}
	}
}
