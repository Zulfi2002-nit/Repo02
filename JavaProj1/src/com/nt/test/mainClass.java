package com.nt.test;

import com.nt.sbeans.Studentbeans;

public class mainClass {
	
	public static void main(String args[]) {
		 
	 Studentbeans  sb = new Studentbeans();
	 sb.setsName("zulfi");
	 sb.setsId(01);
	 sb.getsName();
	 sb.getsId();
	 
	 System.out.println(" Student Name : "+sb.getsName());
	 System.out.println("Student Id : "+sb.getsId());
	 	
	}
}
