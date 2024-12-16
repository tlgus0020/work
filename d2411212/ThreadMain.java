package d2411212;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread1 my1=new MyThread1("first");
		my1.start();
		MyThread1 my2=new MyThread1("second");
		my2.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("main:"+i);
			if(i==70) {
				my1.notifyAll();
				my2.notifyAll();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	}

}
