package javatutorials.polymorphism;

interface father{}
interface mather{}
interface programmer{
	public void coding();
}
interface believer{}

class Steve implements father, programmer, believer {
	public void coding() {
		System.out.println("coding faster");
	}
}

class Rachel implements mather, programmer, believer {
	public void coding() {
		System.out.println("coding harder");
	}
}


public class Workspace {

	public static void main(String[] args) {
		//직장에서 스티브, 레이첼은 엄마,아빠인지는 중요하지 않고 단지 programmer의 입장으로 바라봄
		//스티브, 레이첼이 가진 다른 인터페이스를 상관하지 않고 programmer 인터페이스를 데이터타입으로 설정
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();
	}
}
