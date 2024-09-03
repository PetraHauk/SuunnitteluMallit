package Abstract_Factory.Checkbox;

public class CheckboxB extends Checkbox {

    public CheckboxB(boolean checked) {
        super(checked);
    }

    @Override
    public void display() {
        System.out.println("(" + (checked ? "x" : " ") + ") Checkbox");
    }
}
