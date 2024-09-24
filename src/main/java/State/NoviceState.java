package State;

public class NoviceState extends State {

    public NoviceState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        getCharacter().setExperience(getCharacter().getExperience() + 5);
        System.out.println("Training... Gaining 5 points of experience");
    }

    @Override
    void meditate() {
        System.out.println("Meditation is not available for Novice");
    }

    @Override
    void fight() {
        System.out.println("Fighting is not available for Novice");
    }
}
