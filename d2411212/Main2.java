package d2411212;

class ParentA {
	public ParentA() {
		System.out.println("ParentA ������");
	}
	public ParentA(int a) {
		System.out.println("�ʵ� ParentA ������");
	}
	public void ParentPrint() {
		System.out.println("parent print �Լ� ȣ��");
	}
}

class ChildA extends ParentA{
	public ChildA() {
//		super(1);
//		super();
		System.out.println("ChildA ������");
		//super(1); // super�� �θ� �����ڸ� ȣ�������� �θ� ���� ������ �� ���� �����ڰ� ȣ���� �ȴ�.
		super.ParentPrint(); // super() ������ �Լ��� ȣ�������� super.�� �Լ��� ȣ���Ѵ�
	}
}

public class Main2 {

	public static void main(String[] args) {
		new ChildA();

	}

}
