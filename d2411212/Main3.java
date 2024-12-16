package d2411212;

public class Main3 {

	public static void main(String[] args) {
		Cal cal=new Cal();
		
		AbstractCal aca1=new AbstractCal() {
			@Override
			public int mux(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		System.out.println(aca1.mux(10,20));
		
		AbstractCal aca2=new ImplCal();
	}
}

class ImplCal extends AbstractCal{ 
	@Override
	public int mux(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
