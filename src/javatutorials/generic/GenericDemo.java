package javatutorials.generic;

//제네릭은 변수의 데이터타입과 관련 있음
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
		Person p1 = new Person("부장"); //데이터타입이 object이기에 String이 들어올 수 있음. -> 런타임 에러 발생
																//-> 타입에 대해서 안전하지 않다고 한다. 모든 타입이 올 수 있기에 타입을 엄격하게 제한할 수 없는 것
		EmployeeInfo ei = (EmployeeInfo)p1.info;
	}
}

//제네릭은 인스턴스화 할때 <>안에 데이터타입을 주고, String이 T가 되어서 결과적으로 info가 String타입이 된다.
