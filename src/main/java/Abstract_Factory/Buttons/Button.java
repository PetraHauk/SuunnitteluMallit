package Abstract_Factory.Buttons;



public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
