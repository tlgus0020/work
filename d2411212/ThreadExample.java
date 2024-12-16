package d2411212;

class SharedResource {
	private int counter = 0;
	
	public synchronized void increment() {
		counter++;
		System.out.println((Thread.currentThread()).getName()+":"+counter);
	}
	
}


class MyThread extends Thread {
	private ThreadExample sharedResource;
	
	public MyThread(ThreadExample sharedResource) {
		this.sharedResource = sharedResource;
	}
@Override
public void run() {
	for(int i=0;i<5;i++) {
		sharedResource.increment();
	}
	System.out.println((Thread.currentThread()).getName()+"쓰레드 종료");
}
}
public class ThreadExample{
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		
		Thread thread1= new MyThread(SharedResource);
		Thread thread2= new MyThread(SharedResource);
		Thread thread3= new MyThread(SharedResource);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
		thread1.join(); //thread1이 끝날때까지 기다리는 함수
		thread2.join();
		thread3.join();
		} catch(Exception e) {
			
		}
		System.out.println("main thread 종료");
	}

}
