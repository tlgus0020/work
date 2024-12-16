package d2411212;

class A {
	public void aprint() {
		System.out.println("A print");
	}
}
class AA extends A{
	
	@Override
	public void aprint() {
		System.out.println("AA print");
	}
	public void bprint() {
		System.out.println("BB print");
	}

}

public class Main1 {

	public static void main(String[] args) {
		A a=new A();
		a.aprint();
		
		AA aa=new AA();
		aa.aprint();
		
		//aa.super(); // super는 부모  객체를 의미
		A b=new AA(); // 좌측은 부모 클래스, 우측은 자식 클래스
		b.aprint();
		//b.bprint(); // 사용불가, 부모클래스는 bprint를 가지고 있지 않기 때문
		AA c=(AA)new A();
		c.aprint();

	}

}
