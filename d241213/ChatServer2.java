package d241213;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.*;

public class ChatServer2 {
	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client=null;
		InputStream in=null;
		OutputStream out=null;
		
		System.out.println("���� ���α׷�");
		try {
		server=new ServerSocket(9999);
		
		System.out.println("���� ���");
		client=server.accept();
		System.out.println("Ŭ���̾�Ʈ ����");
		in=client.getInputStream();
		out=client.getOutputStream();
		
		while(true) {
//		String msg="hello client";
		String msg=new Scanner(System.in).nextLine();
		out.write(msg.getBytes());
		out.flush();
		Thread.sleep(3000);
		System.out.println("���� ���� ����");
		}
		
		}catch(Exception e) {e.printStackTrace();}

		
	}
}
