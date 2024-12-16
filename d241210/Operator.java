package d241210;

public class Operator {

	public static void main(String[] args) {
		//1에서 100까지 합을 구하시오
		// 최종합을 출력하는게 목표
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		// 최대값, 최소값
		int max=0;
		int[] data= {100,400,303,31,62};
		for(int i=0;i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		System.out.println(max);
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+","+j);
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	

}
