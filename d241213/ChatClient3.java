package d241213;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient3 {
	public static void main(String[] args) {
		Socket socket=null;
		InputStream in=null;
		OutputStream out=null;
		
		System.out.println("Ŭ���̾�Ʈ ���α׷�");
		try {
		socket=new Socket("211.253.53.86",9999);
		System.out.println("���� ����");
		in=socket.getInputStream();
		out=socket.getOutputStream();
		
		while(true) {
		//�����Ͱ� �� �� ���� �� �ڸ��� �ӹ��� �ְ� �ݺ��ϸ��.
		//������ �����Ͱ� 0�̸� ��� �ӹ��� �ְ� �ݺ�
		//�������� ������ Ŭ���̾�Ʈ�� �ް� Ŭ���̾�Ʈ�� ������
		while(in.available()==0) {}
		while(in.available()>0) {
			System.out.print((char)in.read());
			if(in.available()==0) {
				System.out.println();
			}
			}
		System.out.print("ä�� �Է�:");
		String msg=new Scanner(System.in).nextLine();
		out.write(msg.getBytes());
		out.flush();
		Thread.sleep(1000);
		}
//		System.out.println("Ŭ���̾�Ʈ ����");
		}catch(Exception e) {
			e.printStackTrace();
			}
			
		
	
}
}