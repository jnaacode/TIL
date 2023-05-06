package parkjina;

import java.util.Scanner;

public class Study {
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int input2 = sc.nextInt();
	
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + input2/input1 );
		System.out.println("사탕 개수 : " + input2%input1 );
		
		
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년: ");
		int input2 = sc.nextInt();
		
		System.out.print("반 : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호 : ");
		int input6 = sc.nextInt();
		
		System.out.print("성별: ");
		String input4 = sc.next();

		System.out.print("성적: ");
		double input5 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f입니다."
				,input2,input3,input6,input1,input4,input5);
		
	}
		
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input1 = sc.nextInt();
		
		if(input1 /2 ==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀 수 입니다.");
		}
		
	}
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력 : ");
		int input1 = sc.nextInt();
		
		
		if(input1<0||input1>100) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			System.out.println("키 입력 :");
			double height = sc.nextDouble();
		
		
		if(input1 <12) {
			System.out.print("적정 연령이 아닙니다.");
			
		}else if(height<140.0) {
			System.out.println("적정키가 아닙니다.");
		}else {
			System.out.println("탑승가능");
		}
		
		}
		
	}
	
	public void ex5() {
		
		//1부터 20까지 1씩 증가하면서 출력
		//단, 5의 배수()를 붙여서 출력
		//ex)1 2 3 4 (5) 6 7 8 9 (10)

		for(int i = 1 ; i <=20 ; i++){
		
		if(i % 5 ==0) {
			System.out.print("("+i+") ");
		}else {
			System.out.print(i+" ");
		}
		}
		
	}
	
	public void ex6() {
		
		// 1 부터 20까지 1씩 증가하면서 출력 
		// 단, 입력 받은 수의 배수는 () 표시
		
		Scanner sc = new Scanner(System.in);
		System.out.print("괄호를 표시할 배수 : ");
		int input1 = sc.nextInt();
		
		for(int i = 1 ; i <=20 ; i++){
			
			if(i % input1 ==0) {
				System.out.print("("+i+") ");
				
			}else {
				System.out.print(i+" ");
			}
		}
	}
	
	public void ex7() {
		
		  // [구구단 출력]
	      // 2 ~ 9 사이 수를 하나 입력 받아
	      // 해당 단을 출력
	      // 단, 입력 받은 수가 2 ~ 9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<10) {
		
		for(int i=0;i<=9;i++) {
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
		
		}else {	
			System.out.print("잘못 입력 하셨습니다.");
		}
	}
	
	public void ex8() {
		//2중 for문 이용해서 다음 모양을 다섯번 출력하세요
		
		//12345
		//12345
		
		for(int i = 1 ; i<=5;i++) {
			for(int x =1;x<=5;x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

	public void ex9() {
		
		for(int i = 1 ; i<=5;i++) {
			for(int x =1;x<=i;x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public void ex10() {
		
		for(int i = 4 ;i>=1;i--) {
			for(int x =i ; x>=1;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public void ex11() {
		
		// count(숫자세기)
		//1부터 20까지 1씩 증가하면서 
		//3의 배수의 총 개수 출력
		//3 6 9 12 15 18 : 6개 
		//3의 배수의 합계 : 63
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1 ;i<=20 ;i++) {
			
			if(i%3==0) {
				count++;
				sum+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println(":"+count+"개");
		System.out.print("3의 배수의 합계 :"+sum);
		
	}
	public void ex12() {
		
	Scanner sc = new Scanner(System.in);
		
		int input = 0; 
		int sum = 0;
		
		do {
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input; //입력 받은 값을 sum에 누적 

		}while(input != 0);
		
		System.out.println("합계 :" + sum);
		
		
		
	}
}
	
	


