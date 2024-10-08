package Chain_of_Responsibility;

public abstract class Handler {
    protected Handler nextHandler;

    public void handleMessage(Messege messege) {
        if (!processMessage(messege) && nextHandler != null) {
            nextHandler.handleMessage(messege);
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract boolean processMessage(Messege message);
}
