package Composite;


import java.util.ArrayList;
import java.util.List;

public class Department extends Component {
    private List<Component> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Component component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    @Override
    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<department name=\"").append(name).append("\">");
        System.out.println("");
        for (Component component : components) {
            xml.append(component.toXML());
            System.out.println(component.toXML());
        }
        xml.append("</department>");
        return xml.toString();
    }
}
