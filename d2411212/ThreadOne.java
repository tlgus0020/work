package d2411212;

public class ThreadOne implements Runnable{

	String name;
	int num;
	
	public ThreadOne() {
		// TODO Auto-generated constructor stub
	}
	public ThreadOne(String name,int num) {
		this.name=name;
		this.num=num;
	}
	
	@Override
	public void run() {
		for(int i=0;i<num;i++) {
			System.out.println(i+":"+name);
		}
		
	}

}
