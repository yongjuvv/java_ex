package javatutorials.accessmodifier;

class A {
	public String y() {
		return "public void y()";
	}
	//private은 클래스 밖에서는 접근할 수 없다는 의미
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
	//z()가 private이기에 클래스 밖에서 사용할 수 없음
	System.out.println(a.x());
}
}
