package task2;

public class Employee {
	int empId;
	String empName;
	double sal;
	int yearOfService;
	public Employee(int empId, String empName, double sal, int yearOfService) {
		setEmployeeDetails(empId,empName,sal,yearOfService);
	}
	public void setEmployeeDetails(int empId, String empName, double sal, int yearOfService) {
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
		this.yearOfService=yearOfService;
	}
	public String getEmployeeDetails() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", yearOfService=" + yearOfService
				+ "]";
	}
	public double loanEligibility() {
		if(yearOfService<=5)
			return 0.0;
		if (sal >= 1500000)
            return 700000;
        else if (sal >= 1000000)
            return 500000;
        else if (sal >= 600000)
            return 200000;
		else
			return 0.0;
	}
}
