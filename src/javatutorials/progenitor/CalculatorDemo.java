package javatutorials.progenitor;
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    public String toString() {
    	return "left : " + this.left + ", right : " + this.right;
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1); //결과 : javatutorials.progenitor.Calculator@49e4cb85 이것은 c1이 클래스 Calculator의 인스턴스라는 의미. @뒤의 내용은 인스턴스에 대한 고유한 식별값
        System.out.println(c1.toString());
        //toString메소드는 자바에서 특별히 취급하는 메소드
        //toString을 직접 호출하지 않아도 어떤 객체를 System.out.println로 호출하게 되면 자동으로 toString이 호출되도록 약속되어있다.
    }
}
