package d2411212;

public class Module extends Thread{
	String name;
	public Module() {
		// TODO Auto-generated constructor stub
	}
	public Module(String name) {
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(name+".프로그램 실행:"+i);
			
			try{
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}
}
