package parkjina;

import java.util.Scanner;

public class Study {
	
	public void ex1() {
		
		for(int i =0;i<=10;i++) {
			System.out.println(i + " ");
			
			if(i==5) {
				break;
			}
		}
		
	}
	
	public void ex2() {
	
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		int sum = 0;
		
		while(true){
			
			System.out.println("정수입력 : ");
			input =sc.nextInt();
			if(input ==0) {
				break;
			}
			sum+=input;
		}
			
		System.out.println("합계 "+sum);
	
	}
	
	
	

}
