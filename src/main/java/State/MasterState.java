package State;

public class MasterState extends State{

        public MasterState(Character character) {
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
            getCharacter().setHealth(getCharacter().getHealth() - 10);
            getCharacter().setExperience(getCharacter().getExperience() + 5);
            System.out.println("Fighting... Losing 10 points of health. Gaining 5 points of experience");
        }

        @Override
        public void displayStatus() {
            System.out.println("Reaching the highest level. The game is over.");
        }
}
