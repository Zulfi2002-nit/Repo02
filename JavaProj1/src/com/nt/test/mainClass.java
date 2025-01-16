package com.nt.test;

import com.nt.sbeans.Studentbeans;

public class mainClass {
	
	public static void main(String args[]) {
		 
	 Studentbeans  sb = new Studentbeans();
	 sb.setsName("zulfi");
	 sb.setsId(11);
	 sb.setsAge(18);
	 sb.getsName();
	 sb.getsId();
	 sb.getsAge();
	 
	 System.out.println(" Student Name : "+sb.getsName());
	 System.out.println("Student Id : "+sb.getsId());
	 System.out.println("Student Age : "+sb.getsAge());
	 	
	}
}
