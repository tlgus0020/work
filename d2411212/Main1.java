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
		
		//aa.super(); // super�� �θ�  ��ü�� �ǹ�
		A b=new AA(); // ������ �θ� Ŭ����, ������ �ڽ� Ŭ����
		b.aprint();
		//b.bprint(); // ���Ұ�, �θ�Ŭ������ bprint�� ������ ���� �ʱ� ����
		AA c=(AA)new A();
		c.aprint();

	}

}
