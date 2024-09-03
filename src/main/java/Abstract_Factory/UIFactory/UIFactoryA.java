package Abstract_Factory.UIFactory;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Buttons.ButtonA;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.Checkbox.CheckboxA;
import Abstract_Factory.TextField.TextField;
import Abstract_Factory.TextField.TextFieldA;

public class UIFactoryA extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public Checkbox createCheckbox(boolean checked) {
        return new CheckboxA(checked);
    }
}