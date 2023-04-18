package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스 

	//ex1()메소드
	// -> OpExample이 가지고 있는 기능중 ex1()이라는 기능 
	public void ex1() {
		
		//syso 작성 후 ctrl + space
		System.out.println("OpExample 클래스에 ex1()기능 수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("println 자동완성해봤어요");
	
	}
	//ex2()메소드(기능)
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 :");
		int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴
		
		System.out.print("정수 입력 2 :");
		int input2 =sc.nextInt();
		
		System.out.printf("%d / %d = %d\n", input1,input2,input1/input2);
		System.out.printf("%d %% %d = %d\n", input1,input2,input1/input2);
		
	}
	
	public void ex3() {
		// 증감(증가++, 감소-- 연산자)
		// -> 피연산자 (값)를 1 증가 또는 감소 시키는 연산자 
		
		int iNum1 =10;
		int iNum2 =10;
		
		iNum1++; //1증가 
		iNum2--; //1감소
		
		System.out.println("iNum1:" + iNum1);
		System.out.println("iNum2:" + iNum2);
		
		//전위 연산  :++3,--2 연산자가 앞쪽에 배치 , 다른 연산자보다 먼저 증가/감소한다.
		
		int temp1 = 5;
		System.out.println(++temp1+5);
		                 // ++5 + 5 
		                 //   6 + 5 = 11
		
		System.out.println("temp1 :" + temp1);
		// temp1 = 5+1; 먼저 수행 후 6+5에 대한 값을 출력  
		
		
		//후위 연산 :3++,2-- 연산자가 뒤쪽에 배치 , 다른연산자보다 나중에 증가/감소 
		
		int temp2 = 3;
		System.out.println(temp2-- + 2);
						// 3 -- + 2 ==5
						// temp2 = 2;(1감소)
		
		System.out.println("temp2 :" + temp2);
		// 3+2에 대한 값을 출력 후 temp2 = 3-1;을 수행
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		// (a)3 ++ + -- 5(b)
		//  c = (a)3 ++ + 4(b)
		//	= 7
		
		
		System.out.printf("%d/%d/%d\n",a,b,c); 
		}
	
		public void ex4() {
			
			//비교 연산자 : >, <, >=, <=, ==, !=
			// - 결과는 항상 논리값이다 (true/false)
			// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽! >= , <=
			
			// = (대입연산자) , ==(같다) 
			
			
			int a = 10;
			int b = 20;
			
			System.out.println(a < b); //true
			System.out.println(a > b); //false
			System.out.println(a != b); //true
			System.out.println(a == b); //false
			
			System.out.println("--------------------------------------");
			
			int c = 4;
			int d = 5;
			
			System.out.println( c<d );
			System.out.println( c+1 <= d );
			System.out.println((++c != d) ==(--c != d));
							// ++4 != 5 -> false
							// --5 ! = 5 -> true  
			
			System.out.println("--------------------------------------");
			
			int temp = 723;
			
			System.out.println("temp는 짝수인가 ?" + (temp % 2 == 0));
			System.out.println("temp는 짝수인가 ?" + (temp % 2 != 1));
			
			
			System.out.println("temp는 홀수인가 ?" + (temp % 2 == 1));
			System.out.println("temp는 홀수인가 ?" + (temp % 2 != 0));
			
			System.out.println("temp는 3의 배수인가?"+ (temp % 3 == 0));
			System.out.println("temp는 4의 배수인가?"+ (temp % 4 == 0));
			System.out.println("temp는 5의 배수인가?"+ (temp % 5 == 0));
			
			
		}
	
}
