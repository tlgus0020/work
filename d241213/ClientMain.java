package d241213;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Ŭ���̾�Ʈ ���α׷�");
		Socket socket=new Socket("211.253.53.86",1234);
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		String msg="hello socket programming";
		out.write(msg.getBytes());

	}

}
