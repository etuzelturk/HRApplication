import java.util.ArrayList;

public class HrApp {
    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<Department>();

        Department itDepartment = new Department("Information Technology");
        Department salesDepartment = new Department("Sales");
        Department financeDepartment = new Department("Finance");
        Department marketingDepartment = new Department("Marketing");

        itDepartment.addEmployee(new Employee(1,"Luke Skywalker", "Senior Developer"));
        itDepartment.addEmployee(new Employee(2,"R2-D2", "IT Support Specialist"));
        salesDepartment.addEmployee(new Employee(3,"Han Solo", "Sales Manager"));
        salesDepartment.addEmployee(new Employee(4,"Chewbacca", "Customer Success Manager"));
        financeDepartment.addEmployee(new Employee(5,"Jabba the Hutt", "Finance Manager"));
        financeDepartment.addEmployee(new Employee(6,"Boba Fett", "Accountant"));
        marketingDepartment.addEmployee(new Employee(7,"Darth Vader", "Marketing Manager"));
        marketingDepartment.addEmployee(new Employee(8,"Yoda", "Marketing Specialist"));

        departments.add(itDepartment);
        departments.add(salesDepartment);
        departments.add(financeDepartment);
        departments.add(marketingDepartment);

        printEmployeesOfDepartments(departments);
    }
    public static void printEmployeesOfDepartments(ArrayList<Department> departmentList) {
        for (Department department : departmentList) {
            System.out.println("--- " + department.getDepartmentName() + " ---");
            for(Employee employee : department.getEmployees()) {
                System.out.println(employee);
            }
            System.out.println("\n");
        }
    }
}