package javatutorials.generic;

interface Info{
	int getLevel();
}
class EmployeeInfo3 implements Info{
	public int rank;
	EmployeeInfo3(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}
class Person3<T extends Info> { //Person3의 T는 Info클래스, 인터페이스나 그 자식 외에는 올 수 없다.
	public T info;
	Person3(T info) {
		this.info = info;
	}
}


public class GenericDemo3 {

}
