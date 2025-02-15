package task2;
/*
Create a class named Employee with the following details: 
 empId   :: int 
 empName :: String 
 sal     :: double 
Methods 
getEmployeeDetails() 
setEmployeeDetails() 
getLoanEligibility() 
check if the employee is eligible to get loan. The conditions arE: 
* an employee should have worked for greater than 5 years. 
* If his /her annual salary is 6 lakhs then 2 lakhs of loan is granted. 
* If his/her annual salary is >=10 lakhs then 5 lakhs of loan is granted. 
* If his/her annual salary is >=15 lakhs then 7 lakhs of loan is granted. 
*/
public class Demo {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Sagar", 3000000, 6);
		System.out.println(emp.getEmployeeDetails());
        System.out.println("Loan Eligibility: " + emp.loanEligibility());

	}

}
