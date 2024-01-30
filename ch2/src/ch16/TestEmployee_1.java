package ch16;

import ch17.Employee;

public class TestEmployee_1 {
    public static void main(String[] args) {
        TestEmployee employeeLee = new TestEmployee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.getEmployeeName());

        TestEmployee employeeKim = new TestEmployee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
        System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());


    }


}
