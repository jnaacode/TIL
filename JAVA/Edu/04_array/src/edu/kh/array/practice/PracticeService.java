package edu.kh.array.practice;

import java.util.Scanner;

public class PracticeService {

//	길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	//	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	public void practice1() {
		int arr[] = new int[9];
		
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+1;
			
			if(i % 2 == 0) {
				sum += arr[i];
				//System.out.println("arr["+ i +"] 의 값 " );
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	//	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	//	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급
	public void practice2() {

		int[] arr = new int[9];

		// int num = 9;

		int sum = 0; // 합계용 변수

		for (int i = 0; i < arr.length; i++) {

			arr[i] = 9 - i;
			// arr[i] = num;
			// num--;

			if (i % 2 == 1) { // i 가 홀수인 경우
				sum += arr[i];
			}

			System.out.print(arr[i] + " "); // 출력
		}

		System.out.println("\n홀수 번째 인덱스 합 : " + sum);

	}
	
	//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	//	정수 5개를 입력 받아 배열을 초기화 하고
	//	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	//	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		System.out.print("인덱스 : " );
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == input) {
				System.out.print(i + " ");
				
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 
	//	검색할 문자가 문자열에 몇 개 들어가 있는지
	//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0); // 입력 받은 문자열에서 0번 인덱스 문자를 반환
		//         String -> char
		
		char[] arr = new char[input.length()]; // 입력 받은 문자열 길이 만큼의 배열 생성
		
		int count = 0; // input에 일치하는 ch가 몇개 있는지 카운트하는 변수
		System.out.print(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i < arr.length; i++) {
			
			// 배열 대입
			arr[i] = input.charAt(i);
			// 입력 받은 문자열에서 i번째 인덱스 문자를 arr[i]에 대입
			
			// 검색 + 카운트
			if(ch == arr[i]) { // 검색 조건
				count++;
				System.out.print(i + " ");
				
			}
		}

		System.out.println("\n"+ ch + "개수 : " + count);
		
		
	}
	
	
	//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		String value = "";
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			value += arr[i] + " ";
		}
		System.out.println(value);
		System.out.println("총 합 : " + sum);
	}
	
	
	//	주민등록번호 번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	//	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i=0; i <arr.length; i++) {
			
			if(i <= 7) { // 7번 인덱스 이하(생년월일, - , 성별)
				arr[i] = input.charAt(i);		
			} else { // 8번 인덱스 이상부터는 *
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 : ");		
		int i = sc.nextInt();
		if(i%3==1 ||i<3) {
			System.out.println("다시 입력 하세요.");
			}else {
			int[] arr = new int[i];
			for(int x=0;x<arr.length;x++) {
			 	System.out.print((x+1)+" ");
				}
			}
	}
	
	public void practice9() {
		
		int [] arr= new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i ++) {
		arr[i]=(int)(Math.random()*10+1);
		
		System.out.print(arr[i]+" ");
		
		}
		
	}
	

}
