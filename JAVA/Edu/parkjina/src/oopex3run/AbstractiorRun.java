package oopex3run;

import oopex1.Abstractior;
import oopex1.MemberService;
import oopex1.StudentService;

public class AbstractiorRun {
	
	public static void main(String[] args) {
		
		Abstractior as = new Abstractior();
		
//		as.ex1();
		
	MemberService service = new MemberService();
	
//	service.displayMenu();
	
	StudentService std = new StudentService();
	
	std.displaymenu();
	}
	
}
