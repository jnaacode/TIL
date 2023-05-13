package edu.kh.basic.run;

import edu.kh.basic.model.service.InheritanceService;
import edu.kh.basic.model.service.MemberService;

public class Run {
	
	public static void main(String[] args) {
		
		MemberService service1 = new MemberService();
//		service1.displayMenu();
		
		InheritanceService service2 = new InheritanceService();
		service2.ex1();
		
		
	}
}
