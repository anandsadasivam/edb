/**
 * 
 */
package org.dp.inc.emp;

/**
 * @author Sathasivam_Anand
 *
 * 
 */
public class Employee1NF {

	/**
	 * DI for Employee Object
	 */
	public Employee1NF(String employeeId, String employeeName,
			String socialSecrutiyCode) {
		// TODO Auto-generated constructor stub		
		emp = new Employee(employeeId, employeeName, socialSecrutiyCode);
	}

	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 */

	
	//Composition
	Employee emp;
	
	//1NF data members
}
