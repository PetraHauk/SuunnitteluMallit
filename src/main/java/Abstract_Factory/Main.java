package Abstract_Factory;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.TextField.TextField;
import Abstract_Factory.UIFactory.UIFactory;
import Abstract_Factory.UIFactory.UIFactoryA;
import Abstract_Factory.UIFactory.UIFactoryB;

public class Main {
    public static void main(String[] args) {
        // UIFactory factory = new UIFactoryA();
        UIFactory factory = new UIFactoryB();

        Button button = factory.createButton("Button A");
        TextField textField = factory.createTextField("Text Field A - Enter name");
        Checkbox checkbox = factory.createCheckbox(true);

        button.display();
        System.out.println();
        textField.display();
        System.out.println();
        checkbox.display();
        System.out.println();

        button.setText("Updated");
        textField.setText("Updated text");
        checkbox.setChecked(false);

        System.out.println("After updating:");
        button.display();
        System.out.println();
        textField.display();
        System.out.println();
        checkbox.display();
    }
}
