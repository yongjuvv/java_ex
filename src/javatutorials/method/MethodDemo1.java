package javatutorials.method;

public class MethodDemo1 {
	//�޼ҵ� ����
	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println("i = " +i);
			i++;
		}
	}
	
	//�޼ҵ� ȣ��
	//main�޼ҵ�� ��Ģ�̸�, �̰��� �ϳ��� ��Ӱ� ����
	//�ڹٰ� main�޼ҵ带 �����ϰ� �Ǵ� ��
	//�� : main�޼ҵ带 �ۼ��ϴ� ��ü / �ڹ� : main �޼ҵ带 �����ϴ� ��ü
	public static void main(String[] args) {
		numbering();
	}
}
