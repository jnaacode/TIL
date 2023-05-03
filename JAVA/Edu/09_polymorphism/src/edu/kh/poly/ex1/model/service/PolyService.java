package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Tesla;

public class PolyService {

	public void ex1() {
		
		//다형성 확인 예제
		
		//Car 객체 생성 
		Car car = new Car();
		//부모타입 참조 변수 = 부모 객체를 참조 하겠다. 
		
		//Tasla 객체 생성
		Tesla tasla = new Tesla();
		//자식타입 참조 변수 = 자신 객체 
		
		Car car2 = new Tesla();
		
		
		
		
	}
	
}
