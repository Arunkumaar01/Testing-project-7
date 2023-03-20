package org.cons;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class SemesterResult {
	public SemesterResult() {//run when object created without initiating
		this(2);
		System.out.println("constructor");
	}
	public void example() {
		//System.out.println("mail id is -"+email);
		
		Map <String, Integer> ma = new HashMap();
		
		System.out.println("Method");
		ma.put("Arun", 85);
		ma.put("Ajay", 34);
		ma.put("Adil", 64);
		ma.put("Manoj", 22);
		ma.put("Arya", 87);
		
		Boolean boo =  ma.containsKey("Adil");
		Integer ge = ma.get("Manoj");
		
		System.out.println(ma);
		System.out.println(boo);
		System.out.println(ge);
	}
	
	public SemesterResult(String name) {
		this(34.34f);
		System.out.println("STRING Parameterized constructor");
	}
	public SemesterResult(int number) {
		this("2323");
		System.out.println("INT Parameterized constructor");
	}
	public SemesterResult(float age) {
		
		System.out.println("float Parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		SemesterResult sem = new SemesterResult();		
	//	SemesterResult sem1 = new SemesterResult("aeasc");
	//	SemesterResult sem2 = new SemesterResult(23);
		
		sem.example();
		
		
		
		
	}

}