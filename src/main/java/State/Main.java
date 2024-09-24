package State;

import javafx.scene.Scene;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your character name: ");
        String name = scanner.nextLine();
        Character character = new Character(name);

        while (!(character.getState() instanceof MasterState)) {
            System.out.println("Choose your action: ");
            System.out.println("1. Train");
            System.out.println("2. Meditate");
            System.out.println("3. Fight");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    character.train();
                    character.getState().displayStatus();
                    break;
                case 2:
                    character.meditate();
                    character.getState().displayStatus();
                    break;
                case 3:
                    character.fight();
                    character.getState().displayStatus();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
