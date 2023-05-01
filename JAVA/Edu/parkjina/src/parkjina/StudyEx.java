package parkjina;

import java.util.Scanner;

public class StudyEx {

	
	public void ex1() {
		
		System.out.println("테스트1");// 출력 구문 줄 바꿈 O 
		System.out.print("테스트2");//줄바꿈 불가로 출력하게 되면 오른쪽으로 길게 나열 된다.
		System.out.print("테스트3");//줄바꿈 불가로 출력하게 되면 오른쪽으로 길게 나열 된다.
		
		System.out.println(); // == System.out.print("테스트3\n");
		
		int a = 1;
		int b = 2;
		
		System.out.printf("%d + %d = %d" , a , b ,a+b); 
		// 출력 구문 ,  출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
	}
	
	public void ex2() {
		
		// 입력된 정수가 양수인지 검사 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input >=0) {
			System.out.print("양수입니다.");
		}
	}
	
	public void ex3() {
		//입력된 정수에 대해서 홀짝 검사
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input%2 ==0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
		
	}
	
	public void ex4() {
		
		//입력된 정수에 대해서 음수 양수 0판별해라 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input <0) {
			System.out.println("음수입니다.");
		}else if(input>0) {
			System.out.println("양수입니다.");
		}else{
			System.out.println("0입니다.");
		}
	}

	public void ex5() {
		
		//13세 이하면 어린이입니다. 
		//13세 초과 19이하면 : 청소년입니다.
		//19세 초과시 : 성이닙니다. 출력 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input <= 13) {
			System.out.print("어린이");
		}else if(input > 13 && input <=19) {
			System.out.print("청소년");
		}else {
			System.out.print("성인입니다");
		}
		
	}
	public void ex6() {
		// 점수(100점 만점)를 입력 받아
	      // 90점 이상 : A
	      // 80점 이상 90점 미만 : B
	      // 70점 이상 80점 미만 : C
	      // 60점 이상 70점 미만 : D
	      // 60점 미만 : F
	      // 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = sc.nextInt();
		
		if(input <0 || input>100) {
			System.out.println("잘못입력");
			}else if(input >=90) {
				System.out.println("A");
			}else if(input >=80) {
				System.out.println("B");
			}else if(input >=70) {
				System.out.println("C");
			}else if(input >=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
	}
	
	public void ex7() {
		
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n",kor,eng,math);
		
		int sum =kor+eng+math;
		double avg =(kor+eng+math)/3;
		System.out.println("합계 :"+sum);
		System.out.println("평균 : "+avg);
		
		if(kor >=40 && eng >=40 &&math >=40 && avg >=60) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}
		
	}
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 :");
		double midTerm =sc.nextDouble();
		
		System.out.print("기말 고사 점수 :");
		double finalTerm =sc.nextDouble();
		
		System.out.print("과제 점수 :");
		double homework =sc.nextDouble();
		
		System.out.print("출석 횟수 :");
		double attendance =sc.nextDouble();
		
		System.out.println("================= 결과 =================");
		
		double sum =midTerm*0.2+finalTerm*0.3+homework*0.3+attendance*0.2;
			System.out.println("중간 고사 점수(20) :" + midTerm*0.2);
			System.out.println("기말 고사 점수(30) :" + finalTerm*0.3);
			System.out.println("과제점수(30) :" + homework*0.3);
			System.out.println("출석점수(20) :" + attendance*20*5*0.2);
			System.out.println("합계 : " + sum);
			
			if(sum >=70){
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
	}
	
	public void ex9() {
		
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println("출력 :"+i);
		}
	}
	
	public void ex10() {
		
		for(int i = 3 ; i <=7 ; i++) {
			System.out.print(i);
		}
		
	}

	public void ex11() {
		
		// 1부터 입력 받은 수까지 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 정수 : ");
		int input = sc.nextInt();
				
		for(int i =1 ; i<=input;i+=2) {
			System.out.println(i);
		}
		
	}
	public void ex12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 실수 : ");
		double input = sc.nextDouble();
				
		for(double i =1.0 ; i<=input;i+=0.5) {
			System.out.println(i);
		}
		
	}
	public void ex13() {
		
		for(char i = 'A'; i <='Z';i++) {
			System.out.print(i);}
		
		System.out.println("\n-------------");
			
		for(int x = 'A'; x <='Z';x++) {
			System.out.print((char)x);
		}
		
	}

	public void ex14() {
		//for문 응용1 : 반복문을 이용한 값의 누적
		//1부터 10까지 모든 정수의 합구하기l
		
		int sum =0;
	
		for(int i =1 ; i <=10 ;i++) {
			sum+=i; //sum+i =sum 0 + 1 =sum 
		}
		System.out.println(sum);
	}
	
	public void ex15() {
		// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기 
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i <=5 ; i++) {
			System.out.print("입력" + i + ":"); //5번만 입력 받게 설정
			int input = sc.nextInt();
			sum+=input;
			
		}
		System.out.println("합계 :" + sum);
	}

	public void ex16() {
		
		for(int i =1 ;i<=20 ;i++) {
			
			if(i%5==0) {
			System.out.print("("+i+")"+" ");
			
			}else {
				System.out.print(i+" ");
			}
		
		}
	}
	public void ex17() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 :" );
		int dan =sc.nextInt();
		
		for(int i = 1; i<=9 ;i++) {
			if(dan >= 2 && dan <=9) {
				System.out.printf("%d x %d =%d\n" , dan,i,dan*i);
			}else {
				System.out.print("잘못입력하셨습니다.");
			}
		}
	}
	public void ex18() {
		
		for(int dan = 2 ; dan <=9 ;dan++) {
			
			for(int i =1 ;i <=9 ;i++) {
				System.out.printf("%d x %d =%2d\t",dan,i,dan*i);
		}
		System.out.println();
		
		}
	
	}
	
	
	public void ex19() {
		
		for(int dan = 9 ; dan >=2 ;dan--) {
			
			for(int i = 1 ;i <=9 ;i++) {
				System.out.printf("%d x %d =%2d\t",dan,i,dan*i);
			}
			System.out.println();
		}
	}
	

	public void ex20() {
		//2중 for문 이용해서 다음 모양을 다섯번 출력하세요
		
		//12345
		//12345
		
		for(int i = 1 ; i <=5;i++) {
			
			for(int x = 1 ; x <=5 ; x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public void ex21() {
		
		for(int i = 1 ;i<=4;i++) {
			
			for(int x =1; x<=i ;x++) {
				System.out.print(x);
			}
				System.out.println();
		}
	}

	public void ex22() {
		
		for(int i = 1 ; i <=5 ;i++) {
			
			for(int x = 1 ; x <=5 ;x++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
	public void ex23() {
		
		for(int i = 4 ; i>=1 ; i--) {
			
			for(int x = i ; x >=1 ;x--) {
				
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public void ex24() {
		
		// count(숫자세기)
		//1부터 20까지 1씩 증가하면서 
		//단,3의 배수의 총 개수 출력
		//3 6 9 12 15 18 : 6개 
		//3의 배수의 합계 출력
		
		int sum = 0;
		int count = 0;
		int i =0;
		
		for(i = 1 ;i <= 6 ;i++) 
		{
			
			if(i%3 ==0) 
			{
				System.out.print(i +" ");
				count++; 
				sum+=i; //sum=sum+i;
			}
			
		}
		System.out.println(":" + count + "개");
		System.out.print("3의 배수의 합계 :" + sum);
	}
	
	public void ex25() {
		
		int count = 1;
		
		for(int i = 1; i<=3 ; i++) {
			
			for(int x = 1; x<=4 ;x++) {
				System.out.printf("%-3d" , count);
				count++;
			}
			System.out.println();
		}
	}

	public void ex26() {
		
		//입력되는 모든 정수의 합 구하기 
		//단 0작성하면 결과출력
		
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int input =1;
		
		while(input !=0) {
			System.out.print("정수입력 :");
			input = sc.nextInt();
			sum+=input;
		}
		System.out.println("합계 :" +sum);
	}
	
	public void ex27() {
		
		for(int i = 1; i <=10 ;i++) {
			System.out.print(i+" ");
			
			if(i==5) {
				break;
			}
		}
	}
	public void ex28() {
		Scanner sc = new Scanner(System.in);
		// 안녕하세요.
		// 박진아입니다.
		// 집은 송파구에요
		
		
		System.out.print("첫 줄 입력 :");
		String str1 = sc.next();
		System.out.print("둘째 줄 입력 :");
		String str2 = sc.nextLine();
		System.out.print("셋째 줄 입력 :");
		String str3 = sc.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}