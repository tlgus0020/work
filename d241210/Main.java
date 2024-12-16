package d241210;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		int a=100;
		
		if(a%2==0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		int cnt=0;
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				cnt++;
			}
		}System.out.println(cnt);

	}

}
