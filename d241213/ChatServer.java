package d241213;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client=null;
		InputStream in=null;
		OutputStream out=null;
		
		System.out.println("서버 프로그램");
		try {
		server=new ServerSocket(9999);	
		System.out.println("서버 대기");
		client=server.accept();
		System.out.println("클라이언트 접속");
		in=client.getInputStream();
		out=client.getOutputStream();
		String msg="hello client";
		out.write(msg.getBytes());
		out.flush();
		System.out.println("서버 프로그램 종료");
		Thread.sleep(1000);
		}catch(Exception e) {e.printStackTrace();}

		
	}
}
