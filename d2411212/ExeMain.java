package d2411212;

public class ExeMain {

	public static void main(String[] args) 	{
		Module mu1=new Module("모듈1");
		Module mu2=new Module("모듈2");
		Module mu3=new Module("모듈3");
		
		mu1.start();
		mu2.start();
		mu3.start();
	}

}
