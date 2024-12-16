package d2411212;

public class MyThread1 extends Thread{
	String name;
	public MyThread1() {}
	public MyThread1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
				if(i==50) {
					//stop();
					wait(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
