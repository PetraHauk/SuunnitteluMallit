package Abstract_Factory.Checkbox;

public abstract class Checkbox {
    protected boolean checked;
    public Checkbox(boolean checked) {
        this.checked = checked;
    }
    public abstract void display();
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}