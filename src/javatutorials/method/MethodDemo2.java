package javatutorials.method;

public interface MethodDemo2 {
	//�޼ҵ� : ��Ȱ�뼺�� �پ
	public static void numbering() {
		int i = 0;
		while(i<10) {
			System.out.println("i = " +i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		numbering();
		System.out.println();
		numbering();
		System.out.println();
		numbering();
		System.out.println();
		numbering();
		System.out.println();
		numbering();
		System.out.println();
	}
}
