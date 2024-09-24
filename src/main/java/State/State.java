package State;

public abstract class State {

    private Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    abstract void train();
    abstract void meditate();
    abstract void fight();

    public void displayStatus() {
        System.out.println("Name: " + character.getName());
        System.out.println("State: " + character.getState().getClass().getSimpleName());
        System.out.println("Level: " + character.getLevel());
        System.out.println("Experience: " + character.getExperience());
        System.out.println("Health: " + character.getHealth());
    }
}
