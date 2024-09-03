package Abstract_Factory.Checkbox;

public abstract class Checkbox {
    protected String text;

    public Checkbox(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void display();
}
