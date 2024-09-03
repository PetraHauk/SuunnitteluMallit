package Abstract_Factory.UIFactory;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.TextField.TextField;

public abstract class UIFactory {

    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(boolean checked);
}
