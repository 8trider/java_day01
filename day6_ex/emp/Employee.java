package day6_ex.emp;

abstract class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;

	public Employee() {
	} // 자손 클래스에서 super method를 선택적으로 하기 위해서 넣는다.

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	abstract double tax();
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
