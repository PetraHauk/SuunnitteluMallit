package Abstract_Factory.Checkbox;

public class CheckboxA extends Checkbox {

    public CheckboxA(boolean checked) {
        super(checked);
    }

    @Override
    public void display() {
        System.out.println("[ " + (checked ? "X" : " ") + " ] Checkbox");
    }
}