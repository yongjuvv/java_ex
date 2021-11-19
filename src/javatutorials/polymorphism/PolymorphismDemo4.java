package javatutorials.polymorphism;

interface I{} 
class E implements I{}

public class PolymorphismDemo4 {
	public static void main(String[] args) {
		I obj = new E();
	}
}
