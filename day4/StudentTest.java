package day4;

class Student {
	String name;
	int age;
	String subject;

	String getStudentInfo() {
		return name + "학생은 나이가 " + age + "세입니다.";
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getStudentInfo());
		st.name = "자바";
		st.age = 8;
		st.subject = "커피";
		System.out.println(st.getStudentInfo());
		
		Student st1 = new Student();
		st1.name = "파이썬";
		st1.age = 88;
		st1.subject = "몬티";
		System.out.println(st1.getStudentInfo());
		
		Student st2 = new Student();
		st2.name = "스프링";
		st2.age = 888;
		st2.subject = "봄";
		System.out.println(st2.getStudentInfo());
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
	}
}
