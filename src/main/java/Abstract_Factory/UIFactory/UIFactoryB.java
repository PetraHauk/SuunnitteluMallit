package Abstract_Factory.UIFactory;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Buttons.ButtonB;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.Checkbox.CheckboxB;
import Abstract_Factory.TextField.TextField;
import Abstract_Factory.TextField.TextFieldB;

public class UIFactoryB extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public Checkbox createCheckbox(boolean checked) {
        return new CheckboxB(checked);
    }
}
