package d241213;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		Socket client=null;
		ServerSocket server=null;
		InputStream in=null;
		OutputStream out=null;
		// ip�ּ� 211.253.53.86:1234
		System.out.println("�������α׷�");
		while(true) {
			try {
		server=new ServerSocket(1234);
			} catch (Exception e) {}
			
		System.out.println("���� �����.....");
		try {
		client=server.accept(); //������
		System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
		in = client.getInputStream();
		out = client.getOutputStream();
		}catch(Exception e) {}
		while(true) {
			try {
			System.out.print((char)in.read());
			} catch(Exception e) {}
		}
		}
//		System.out.println("���� ���α׷� ����");
		
	}

}
