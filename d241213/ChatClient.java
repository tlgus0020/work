package d241213;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		Socket socket=null;
		InputStream in=null;
		OutputStream out=null;
		
		System.out.println("클라이언트 프로그램");
		try {
		socket=new Socket("211.253.53.86",9999);
		System.out.println("서버 연결");
		in=socket.getInputStream();
		out=socket.getOutputStream();
		Thread.sleep(2000);
		while(in.available()>0) {
			System.out.println((char)in.read());
			}
		System.out.println("클라이언트 종료");
		}catch(Exception e) {
			e.printStackTrace();
			}
			
		
	}
}
