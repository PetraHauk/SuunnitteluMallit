package Composite;

public class Organization {
    private Department headquarterDepartment;

    public Organization(String name) {
        this.headquarterDepartment = new Department(name);
    }

    public void add(Component component) {
        headquarterDepartment.add(component);
    }

    public void remove(Component component) {
        headquarterDepartment.remove(component);
    }

    public double getTotalSalary() {
        return headquarterDepartment.getSalary();
    }

    public void print() {
        System.out.println(headquarterDepartment.toXML());
    }
}
