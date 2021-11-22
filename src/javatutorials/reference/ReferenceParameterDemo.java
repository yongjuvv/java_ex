package javatutorials.reference;

public class ReferenceParameterDemo {
	static void _value(int b) { //int b = a;
		b = 2;
	}
	public static void runValue() {
		int a = 1;
		_value(a);
		//a�� �⺻������ Ÿ��(int)�̱⿡ ���� ��ȭ���� �ʴ´�.
		System.out.println("runValue, " +a);
	}
	static void _reference1(A b) { //A b = a;
		b = new A(1); //���� b�� new A(2)�� �����ϰ� ����, id = 2
	}
	public static void runReference1() {
		A a = new A(1); //new A(1)����, id�� 1
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	static void _reference2(A b) { //A b = a A��� ������Ÿ���� ������ �ִ� �ν��Ͻ� b�� �ν��Ͻ� a�� �����Ѵ�.
		b.id = 2; //a�� b�� ���� �ν��Ͻ��� �����ϰ� ����, b�� id���� �ٲٸ� a�� id���� �����ϰ� �޶��� (����!!!)
	}
	public static void runReference2(){
        A a = new A(1); //A��� ������Ÿ���� �ν��Ͻ� a�� 1�̶�� ���� ���ο� A������Ÿ���� �ν��Ͻ��� �����Ѵ�. 
        _reference2(a);
        System.out.println("runReference2, "+a.id);     
    }
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
