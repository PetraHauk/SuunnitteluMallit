package Abstract_Factory.Buttons;

public class ButtonA extends Button {
    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("------------------");
        System.out.println("| " + text + "    |");
        System.out.println("------------------");
    }
}