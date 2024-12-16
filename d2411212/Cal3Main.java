package d2411212;

class Cal3 implements Inter{
	int sum;
@Override
public int add(int i, int j) {
	sum=i+j;
	return i+j;
}
@Override
	public int sub(int i, int j) {
		sum=i+j;
		return i-j;
	}
	public int getSum() {
		return sum;
	}
}
public class Cal3Main{
	public static void main(String[] args) {
		Inter cal=new Cal3();
		cal.add(10, 20);
		//인터페이스를 통해서 객체의 변수 및 선언되지 않은 함수는 접근이 불가하다
//		System.out.println(cal.sum);
//		System.out.println(cal);
		cal.sum=100;
	}
}

