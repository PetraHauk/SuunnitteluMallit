package Composite;

public class Main {

    public static void main(String[] args) {
        Organization org = new Organization("Headquarters");

        Department hr = new Department("HR");
        Department sales = new Department("Sales");

        Employee john = new Employee("John", 2000);
        Employee jane = new Employee("Jane", 2100);
        Employee bob = new Employee("Bob", 1600);

        hr.add(john);
        hr.add(jane);
        sales.add(bob);

        org.add(hr);
        org.add(sales);

        System.out.println("Total Salary: " + org.getTotalSalary());
        org.print();
    }
}
