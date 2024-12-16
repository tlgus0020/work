package d2411212;
import java.io.*;
//클래스는 하나의 기능에 대한 집합
public class FileCopyWithProgress extends Thread {
	String name;
	String sourceFile; // 원본 파일
	String destFile; // 복사할 파일
    
    public FileCopyWithProgress() {
		// TODO Auto-generated constructor stub
	}
    public FileCopyWithProgress(String name,String sourceFile,String destFile) {
		this.name=name;
    	this.sourceFile=sourceFile;
		this.destFile=destFile;
	}
    
    public void run() {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            long totalBytes = sourceFile.length();
            long bytesCopied = 0;
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                bytesCopied += bytesRead;
                try {
                	Thread.sleep(500);
                } catch(InterruptedException e) {
                	
                }
                int progress = (int) ((bytesCopied * 100) / totalBytes);
                System.out.print("\r"+name+ progress + "%");
                
            }

            System.out.println("\n"+name+": File copy completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
