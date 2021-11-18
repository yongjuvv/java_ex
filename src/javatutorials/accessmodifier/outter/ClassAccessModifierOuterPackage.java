package javatutorials.accessmodifier.outter;
import javatutorials.accessmodifier.inner.*;

public class ClassAccessModifierOuterPackage {
	PublicClass publicClass = new PublicClass();
//	DefaultClass defaultClass = new DefaultClass();
	//default 접근 제어자는 다른 패키지에서 사용할 수 없음
}
