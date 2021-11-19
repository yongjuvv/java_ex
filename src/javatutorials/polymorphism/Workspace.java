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
		//���忡�� ��Ƽ��, ����ÿ�� ����,�ƺ������� �߿����� �ʰ� ���� programmer�� �������� �ٶ�
		//��Ƽ��, ����ÿ�� ���� �ٸ� �������̽��� ������� �ʰ� programmer �������̽��� ������Ÿ������ ����
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();
	}
}
