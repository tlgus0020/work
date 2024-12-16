package d241213;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client=null;
		InputStream in=null;
		OutputStream out=null;
		System.out.println("웹서버");
		try {
			server=new ServerSocket(9999);
			while(true) {
			client = server.accept();
			System.out.println("클라이언트 접속");
			in=client.getInputStream();
			out=client.getOutputStream();
			//웹서버는 3핸드쉐이킹에 의해 동작이 됩니다.
			//들어오는 데이터를 읽는 작업
			while(in.available()>0) {
				System.out.print((char)in.read());
			}
			
			//데이터 보내는 작업
			String header="HTTP/1.1 200 OK\r\n"
					+ "Content-Type: text/html; charset=UTF-8\r\n"+"Connection:close\r\n\r\n";
			
			String body=
					"<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"utf-8\" />\r\n"
					+ "<title>My test page</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "<h1>My</h1>\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n\r\n";
			String msg=header+body;
			out.write(msg.getBytes());
			Thread.sleep(1000);
			client.close();
			}
		}catch(Exception e) {}

	}

}
