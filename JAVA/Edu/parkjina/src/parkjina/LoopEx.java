package parkjina;

import java.util.Scanner;

public class LoopEx {
	
	public void ex1() {
		
		for (int i = 3; i <=7; i++) {
			System.out.print(i + " ");
		}
	}
	public void ex2() {
		
		//1.0부터 입력 받은 실수까지 0.5씩 증가 
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("끝 번호 :");
		
		double num = sc.nextInt();
		
		for(double i =1.0 ; i <=num ; i+=0.5) {
			System.out.println(i + "출력");
		}
	}
	
	public void ex3() {
		
		for(char i ='A' ; i <='Z' ; i++) {
			
			System.out.print(i);
		}
	}
	
	public void ex4() {
		
		//반복문을 이용한 값의 누적 
		// 1부터 10까지 합계 
		
		int sum = 0;
	
		for(int i = 1 ; i <=10 ; i++) {
			
			sum += i; //sum+i=sum 0+1=sum
				
		}
			
		System.out.println(sum);	
	}
	
	public void ex5() {
		
		// 정수 5개를 입력 받아서 합계 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =1 ; i <=5 ;i++) {
			
			System.out.println("입력 : ");
			int num = sc.nextInt();
			int sum =0;
			
			System.out.println(sum);
		}
			
			
		}
		
	}


