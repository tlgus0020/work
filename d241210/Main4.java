package d241210;

public class Main4 {

	public static void main(String[] args) {
		//조건문과 반복문의 형태는 함수정의형태이다.
		int i=0;
		
		if(i<100) {
			System.out.println("i는 100보다 작습니다");
		}
		for(int j=0;j<100;j++) {
			
		}
		int k=0;
		while(k<100) {
			k++;
		}
		String s="1번";
		switch(s) {
		case "1번": System.out.println("1번 출력");break;
		case "2번": System.out.println("2번 출력");break;
		case "3번": System.out.println("3번 출력");break;
		case "4번": System.out.println("4번 출력");break;
		default: System.out.print("이도저도 아닙니다이");
		
		}
	}
}
