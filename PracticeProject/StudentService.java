package PracticeProject;

import java.util.ArrayList;

public class StudentService {
	ArrayList<Student> al = new ArrayList<>();
	// for add Students 
	public void addStudent(Student s) {
		al.add(s);
		System.out.println("Student Successfull!");
	}

	// For View All Students 
	public void viewStudent() {
		if(al.isEmpty()) {
			System.out.println("No Student Found!");
			return;
		}
		for(Student s : al) {
			s.Display();
		}
	}

	//For Search Specific Student 
	public Student searchStudent(int id) {
		for(Student s : al) {
			if(s.id == id) {
				return s;
			}
		}
		return null;
	}

	//for Delete Students 
	public void deleteStudent(int id) {
		Student s = searchStudent(id);
		if(s!=null) {
			al.remove(s);
			System.out.println("Student Deleted!");
		}else System.out.println("Student Not Found!");
	}

	// For Update Students 
	public void updateStudent(int id,String name,int age, String city) {
		Student s = searchStudent(id);
		if(s != null) {
			s.name = name;
			s.age = age;
			s.city = city;
			System.out.println("Student Updated!");
		}else System.out.println("Student Not Found!");
	}

}
