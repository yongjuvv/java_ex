package javatutorials.progenitor;

class Student implements Cloneable{ //Cloneable은 비어있는 인터페이스지만, 클래스 Student가 복제 가능하다는 것을 표시하기 위해 implements를 해야 함. 그렇지 않으면 오류 발생
	String name;

	Student(String name) {
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(Object obj) { // Student 데이터 타입인 s2를 Object 데이터 타입인 변수 obj로 ==> Object obj = s2(자식이 부모인척 가능)
		Student _obj = (Student) obj; // Object 데이터 타입인 obj를 강제적으로 Student타입으로 형변환, Student클래스에 존재하는 name 맴버를 사용하기 위해
										// 왜 강제적으로? -> Object는 모든 클래스의 부모인데, 부모 데이터타입을 자식 데이터타입으로(자식인척) 하는 것은 문제가 발생하기에
										// 자바가 이를 막음 -> 강제적으로 형변환 해야 하는 필요성
		return name == _obj.name;
		// s1의 name == s2의 name
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("yongju");
//		Student s2 = new Student("yongju");
//		System.out.println(s1 == s2); //s1과 s2가 서로 다른 객체이기에 false를 반환
//		System.out.println(s1.equals(s2));
//		
		try {
			Student s3 = (Student)s1.clone();
			System.out.println(s1.name);
			System.out.println(s3.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
