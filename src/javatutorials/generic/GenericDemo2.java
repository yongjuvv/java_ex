package javatutorials.generic;

//제네릭은 변수의 데이터타입과 관련 있음
class EmployeeInfo2 {
	public int rank;

	EmployeeInfo2(int rank) {
		this.rank = rank;
	}
}

class Person2<T, S> {
	public T info;
	public S id;

	Person2(T info, S id) {
		this.info = info;
		this.id = id;
	}
	 public <U> void printInfo(U info) {
		 System.out.println(info);
	 }
}

public class GenericDemo2 {
	public static void main(String[] args) {
		Integer id = new Integer(1);
		Person2<EmployeeInfo2, Integer> p1 = new Person2<EmployeeInfo2, Integer>(new EmployeeInfo2(1), id);
		//제네릭은 참조 데이터 타입에서만 사용할 수 있다 -> 기본 데이터 타입에서는 사용할 수 없음
		//기본 데이터 타입인 int -> 래퍼(Wrapper)클래스  Integer사용
		System.out.println(p1.id.intValue());
		
		EmployeeInfo2 e = new EmployeeInfo2(1);
		Integer i = new Integer(20);
		Person2<EmployeeInfo2, Integer> p2 = new Person2<EmployeeInfo2, Integer>(e,i);
		
		p2.<EmployeeInfo2>printInfo(e);
	}
}
