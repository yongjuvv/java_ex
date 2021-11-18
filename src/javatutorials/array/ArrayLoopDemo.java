package javatutorials.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		String[] members = {"최진혁", "한아람", "이고잉"};
		
		//배열에 저장된 정보를 처리할 때는 반복문을 주로 이용한다. 
		//반복문과 배열은 매우 밀접한 관계에 있다고 할 수 있다.
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
	}
}
