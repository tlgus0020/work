package d241213;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		try {
			/*
		URL url=new URL("https://localhost:8080/insert?a=10&b=20");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
		*/
		URL url=new URL("https://n.news.naver.com/article/629/0000347682?cds=news_media_pc&type=editn");
		InputStream in=url.openStream();
		/*
		while(in.available()>0) {
			System.out.println((char)in.read());
		}*/
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		String temp="";
		while((temp=br.readLine())!=null) {
			System.out.println(temp);
		}
		br.close();
		} catch(Exception e) {}
	}

}
