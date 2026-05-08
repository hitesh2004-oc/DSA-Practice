package PracticeProject;

public class Student {
	int id;
	String name;
	int age;
	String city;
	
	public Student(int id,String name,int age,String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public void Display() {
		System.out.println(id + " | " + name + " | " + age + " | " + city);
	}

}
