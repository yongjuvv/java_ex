package javatutorials.generic;

//���׸��� ������ ������Ÿ�԰� ���� ����
class StudentInfo{
	public int grade;
	StudentInfo(int grade) {this.grade = grade;}
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){this.rank = rank;}
}
class Person {
	public Object info;
	Person(Object info) {this.info = info;}
}
public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person("����"); //������Ÿ���� object�̱⿡ String�� ���� �� ����. -> ��Ÿ�� ���� �߻�
																//-> Ÿ�Կ� ���ؼ� �������� �ʴٰ� �Ѵ�. ��� Ÿ���� �� �� �ֱ⿡ Ÿ���� �����ϰ� ������ �� ���� ��
		EmployeeInfo ei = (EmployeeInfo)p1.info;
	}
}

//���׸��� �ν��Ͻ�ȭ �Ҷ� <>�ȿ� ������Ÿ���� �ְ�, String�� T�� �Ǿ ��������� info�� StringŸ���� �ȴ�.
