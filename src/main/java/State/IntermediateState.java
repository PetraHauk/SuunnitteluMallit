package State;

public class IntermediateState extends State {

    public IntermediateState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        getCharacter().setExperience(getCharacter().getExperience() + 5);
        System.out.println("Training... Gaining 5 points of experience");
    }

    @Override
    void meditate() {
        getCharacter().setHealth(getCharacter().getHealth() + 5);
        System.out.println("Meditating... Gaining 5 points of health");
    }

    @Override
    void fight() {
        System.out.println("Figting is not available for Intermediate");
    }
}
