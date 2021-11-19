package javatutorials.progenitor;

class Student implements Cloneable{ //Cloneable�� ����ִ� �������̽�����, Ŭ���� Student�� ���� �����ϴٴ� ���� ǥ���ϱ� ���� implements�� �ؾ� ��. �׷��� ������ ���� �߻�
	String name;

	Student(String name) {
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(Object obj) { // Student ������ Ÿ���� s2�� Object ������ Ÿ���� ���� obj�� ==> Object obj = s2(�ڽ��� �θ���ô ����)
		Student _obj = (Student) obj; // Object ������ Ÿ���� obj�� ���������� StudentŸ������ ����ȯ, StudentŬ������ �����ϴ� name �ɹ��� ����ϱ� ����
										// �� ����������? -> Object�� ��� Ŭ������ �θ��ε�, �θ� ������Ÿ���� �ڽ� ������Ÿ������(�ڽ���ô) �ϴ� ���� ������ �߻��ϱ⿡
										// �ڹٰ� �̸� ���� -> ���������� ����ȯ �ؾ� �ϴ� �ʿ伺
		return name == _obj.name;
		// s1�� name == s2�� name
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("yongju");
//		Student s2 = new Student("yongju");
//		System.out.println(s1 == s2); //s1�� s2�� ���� �ٸ� ��ü�̱⿡ false�� ��ȯ
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
