package d2411212;

class ParentA {
	public ParentA() {
		System.out.println("ParentA 생성자");
	}
	public ParentA(int a) {
		System.out.println("필드 ParentA 생성자");
	}
	public void ParentPrint() {
		System.out.println("parent print 함수 호출");
	}
}

class ChildA extends ParentA{
	public ChildA() {
//		super(1);
//		super();
		System.out.println("ChildA 생성자");
		//super(1); // super는 부모 생성자를 호출하지만 부모가 먼저 생성한 후 나의 생성자가 호출이 된다.
		super.ParentPrint(); // super() 생성자 함수를 호출하지만 super.은 함수를 호출한다
	}
}

public class Main2 {

	public static void main(String[] args) {
		new ChildA();

	}

}
