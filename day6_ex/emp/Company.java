package day6_ex.emp;

public class Company {
	public static void main(String[] args) {
		Employee[] employees = { new Secretary("Duke", 1, "secretary", 800), new Sales("Tuxi", 2, "sales", 1200) };

		System.out.println("name\tdepartment\tsalary\textra pay");
		System.out.println("---------------------------------------");
		printEmployee(employees, false);

		for (Employee employee : employees) {
			if (employee instanceof Bonus) {
				Bonus bonusEmployee = (Bonus) employee;
				bonusEmployee.incentive(100); // 보너스 지급
			}
		}
		System.out.println();
		System.out.println("name\tdepartment\tsalary\ttax\textra pay");
		System.out.println("---------------------------------------");
		printEmployee(employees, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {

		for (Employee employee : emp) {
	        System.out.print(employee.getName() + "\t" + employee.getDepartment() + "\t" + employee.getSalary());
	        
	        if (isTax && employee instanceof Bonus) {
	            System.out.printf("\t%.1f", employee.tax());
	        } else {
	            System.out.print("\t");
	        }

	        if (employee instanceof Sales) {
	            Sales salesEmployee = (Sales) employee;
	            System.out.printf("\t%.1f", salesEmployee.getExtraPay());
	        }

	        System.out.println();
	    }
	}
}
