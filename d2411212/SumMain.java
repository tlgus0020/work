package d2411212;

abstract class Sum {
    //�߻�޼ҵ� �Դϴ�.
    public abstract String toString();
    
    public String sum(int i, int k){
        int sum = i+k;
        return ""+ sum;
    }
}
class  My1Sum extends Sum{
	@Override
	public String toString() {
		
		return "�� ���� ���� "+sum(10,20);
	}
}

class My2Sum extends Sum{
	@Override
	public String toString() {
		return "result:"+sum(10,20);
	}
}

public class SumMain {

	public static void main(String[] args) {
		Sum s=new My1Sum();
		System.out.println(s);
		
		s=new My2Sum();
		System.out.println(s);
	}

}
