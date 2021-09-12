package day34_encapsulation;

public class C01_Encapsulation01 {

	String name;
	String surName;
	private int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void yasAta(int age) {// obj isterse yasi set eder
		if (age < 0) {
			this.age = -age;
		} else {
			this.age = age;
		}
	}

	public int yasGoster() {// bu method obj isterse yasini gosterir

		return this.age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}else this.age = -age;{
			
		}
		
		
	}
}
