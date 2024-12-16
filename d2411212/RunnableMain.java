package d2411212;

public class RunnableMain {

	public static void main(String[] args) {
//		Thread th1=(Thread)new ThreadOne("choiwanjun",20);
//		Thread th2=(Thread)new ThreadOne("qq",23);
//		Thread th3=(Thread)new ThreadOne("ww",41);

		Thread th1=new Thread(new ThreadOne("choiwanjun",20));
		Thread th2=new Thread(new ThreadOne("qq",23));
		Thread th3=new Thread(new ThreadOne("ww",41));
		
		th1.start();
		th2.start();
		th3.start();
		
//		ThreadOne th1=new Thread(new ThreadOne("choiwanjun",20));
//		ThreadOne th2=new Thread(new ThreadOne("qq",23));
//		ThreadOne th3=new Thread(new ThreadOne("ww",41));

	}

}
