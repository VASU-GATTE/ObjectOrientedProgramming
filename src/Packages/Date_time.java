package Packages;

import java.time.*;

abstract class Nothing{
	abstract void Method(String name);
}

public class Date_time {
//    public static void main(String[] args) {
//        LocalDate date=LocalDate.now();
//        System.out.println(date);
//        
//        
//        ZoneId la=ZoneId.of("America/Los_Angeles");
//        System.out.println("Time : "+la);
//        
//        ZonedDateTime zt=ZonedDateTime.now(la);
//        System.out.println(zt);
//        
//        LocalDate today=LocalDate.now();
//        
//        LocalDate birthday=LocalDate.of(2003, 05, 04);
//        Period p=Period.between(birthday, today);
//        System.out.println(p);
//        
//    }
//}
//class Nothing2 extends Nothing{
	void Method(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Date_time n=new Date_time();
		n.Method("Vasu");
	}
}
