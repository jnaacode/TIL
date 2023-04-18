package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {

		      int iNum1 =10;
		      int iNum2 = 4;
		      
		      float fNum =3.0f;
		      double dNum = 2.5;
		      
		      char ch = 'A';
		      
		      System.out.println(iNum1/iNum2);
		      System.out.println((int)dNum);
		      
		      System.out.println(iNum2*dNum);
		      System.out.println((double)iNum1); //((float)iNum1))
		      
		      System.out.println((double)iNum1/(double)iNum2);
		      System.out.println((float)iNum1/(float)iNum2);
		      System.out.println((double)iNum1/iNum2);
		      
		     
		      System.out.println(dNum);
		      
		      System.out.println((int)fNum);
		      System.out.println(iNum1/(int)fNum);
		      
		      
		      //float/double 차이점 
		      System.out.println(iNum1/fNum); 
		      System.out.println(iNum1/(double)fNum);
		      
		      // float : 소수점 아래 8번째 자리까지 연산 후 반올림
		      // double : 소수점 아래 16번째 자리까지 연산 후 반올림 
		      
		      
		      System.out.println(ch); //((char)ch)
		      System.out.println((int)ch);
		      //문자와 맵핑된 숫자가 나오니 가능하다. 
		      
		      
		      System.out.println(ch+iNum1);//((char)ch+iNum1),75
		      System.out.println((char)(ch+iNum1));
		      
		      
		      
		   }

		}
	


