package State;

public class Character {
    private String name;
    private int level;
    private int experience;
    private int health;
    private State state;

    private final int INTERMEDIATE_LEVEL = 10;
    private final int EXPERT_LEVEL = 20;
    private final int MASTER_LEVEL = 30;


    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState(this);
    }



    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }
    public State getState() {
        return state;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void train() {
        state.train();
        levelUp();
    }

    public void meditate() {
        state.meditate();
        levelUp();
    }

    public void fight() {
        state.fight();
        levelUp();
    }

    private void levelUp() {
        if (experience >= INTERMEDIATE_LEVEL && experience < EXPERT_LEVEL) {
            level = 2;
            setState(new IntermediateState(this));
            System.out.println("Level up to Intermediate");
        } else if (experience >= EXPERT_LEVEL && experience < MASTER_LEVEL) {
            level = 3;
            setState(new ExpertState(this));
            System.out.println("Level up to Expert");
        } else if (experience >= MASTER_LEVEL) {
            level = 4;
            setState(new MasterState(this));
            System.out.println("Level up to Master");
        }
    }

}
