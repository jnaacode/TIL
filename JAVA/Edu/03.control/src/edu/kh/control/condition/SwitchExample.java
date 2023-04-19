package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/* switch 문 
	 * - 식 하나의 결과로 많은 경우의 수를 처리할때 사용하는 조건문 	
	 *  -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다. 
	 *  
	 *  [작성법]
	 * switch (식){
	 * 
	 * case 결과값 1 : 수행코드1 ; break;
	 * case 결과값 2 : 수행코드2 ; break;
	 * case 결과값 3 : 수행코드3 ; break;
	 * 
	 * ...
	 * default : case를 모두 만족하지 않을 경우 수행하는 코드 
	 * 
	 * }
	 * 
	 */

	private int case3;

	public void ex1() {
		
		// 키보드로 정수를 입력 받아
	      // 1 이면 "빨강색"
	      // 2 이면 "주황색"
	      // 3 이면 "노란색"
	      // 4 이면 "초록색"  
	      // 1~4 사이 숫자가 아니면 "흰색" 출력
		
		Scanner sc = new Scanner(System.in);
								// System.in : 키보드 입력 
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		String result; //Syntax error on token(s), misplaced construct(s) 의미는 문법/형식이 틀린거니 다시해라
	   /*
		if(input == 1) {
			result = "빨간색";
		
		}else if(input == 2) {
			result = "주황색";

		}else if(input == 3) {
			result = "노란색";
			
		}else if(input == 4) {
			result = "초록색";
		
		}else {
			result = "흰색";
				
					
		}
		System.out.println(result);
		*/
		
		// 여러 값이 나오는 식
		switch(input) {
		
		case 1 : result = "빨강색" ;break; // input에 입력된 값이 1인 (경우 = case) result 변수에 빨강색을 대입하고 switch 문을 멈춤(break) 
		case 2 : result = "주황색" ;break;
		case 3 : result = "노란색" ;break;
		case 4 : result = "초록색" ;break;
		
		default : result ="흰색";break; // default == 기본값
		}
		System.out.println(result);
	}
	
		public void ex2() {
			
			//정수를 입력 받아 4팀으로 나누기 
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("번호입력 : ");
			int input = sc.nextInt();
			
			String team;
			
			switch(input % 4) {//1,2,3,4,0
			
			case 1 : team = "백팀";break;
			case 2 : team = "홍팀";break;
			case 3 : team = "청팀";break;
			default : team = "흑팀";break;
			}
			
			System.out.print(team+"입니다.");
			
		}
			
		public void ex3() {
			
			// switch 문에서 break의 역할 
			
			// 달 입력 시 계절 판별 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("달(월) 입력 :");
			
			int month = sc.nextInt();
			
			String season; // 결과 저장 변수 선언 
			
			switch(month){
			case 3 : case 4 : case 5 : season = "봄" ;break;
			case 6 : case 7 : case 8 : season = "여름" ;break;
			case 9 : case 10 :case 11 : season = "가을" ;break;
			case 12 : case 1 : case 2 : season = "겨울" ;break;
			default : season = "잘못입력";
			}
		
			System.out.print(season);
			
		
					
				
		}
		
		
		
}

