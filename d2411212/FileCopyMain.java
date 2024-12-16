package d2411212;
public class FileCopyMain {

	public static void main(String[] args) {
		FileCopyWithProgress copy1=new FileCopyWithProgress("copy1","source.txt","destFile1.txt");
		FileCopyWithProgress copy2=new FileCopyWithProgress("copy2","source.txt","destFile2.txt");
		FileCopyWithProgress copy3=new FileCopyWithProgress("copy3","source.txt","destFile3.txt");
		
		copy1.start();
		copy2.start();
		copy3.start();
		
	}

}
