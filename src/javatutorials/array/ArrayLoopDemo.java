package javatutorials.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		String[] members = {"������", "�Ѿƶ�", "�̰���"};
		
		//�迭�� ����� ������ ó���� ���� �ݺ����� �ַ� �̿��Ѵ�. 
		//�ݺ����� �迭�� �ſ� ������ ���迡 �ִٰ� �� �� �ִ�.
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
	}
}
