package day5;

class Student {
	private String name;
	private int age;
	private String subject;

	
	Student() {
		this("둘리", 10, "자바");
	}
	Student(String name, int age, String subject) {
		this.name = name;
		if (age<0)
			this.age = -age;
		else
			this.age = age;
		this.subject = subject;
	}

	String getStudentInfo() {
		return name + "학생은 나이가 " + age + "세입니다.";
	}

	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("둘리", 10, "자바");
		System.out.println(st.getStudentInfo());
		System.out.println(st.getStudentInfo());
		Student st1 = new Student("또치", 11, "HTML");
		System.out.println(st1.getStudentInfo());
		Student st2 = new Student("또치", 10, "CSS");
		System.out.println(st2.getStudentInfo());
		System.out.println(st); // 둘리
		System.out.println(st1); // 또치
		System.out.println(st2); // 도우너
		st1 = st;
		st2 = st;
		System.out.println(st); // 둘리
		System.out.println(st1); // 둘리
		System.out.println(st2); // 둘리
		System.out.println(st.getStudentInfo());
		System.out.println(st1.getStudentInfo());
		System.out.println(st2.getStudentInfo());
	}
}
