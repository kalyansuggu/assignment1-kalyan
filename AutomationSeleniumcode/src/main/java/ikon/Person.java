package ikon;

public class Person {

	public void getName() {
		System.out.println("kalyan");
	}

	public void getAbout() {
		System.out.println("vizag");
	}

	public void getBirthYear() {
		System.out.println("1999-06-15");
	}
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		
		p1.getName();
		p1.getAbout();
		p1.getBirthYear();
	}
	}

