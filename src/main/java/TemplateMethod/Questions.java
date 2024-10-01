package TemplateMethod;

import java.util.Random;

public class Questions {
    private int num1;
    private int num2;
    private int answer;
    private Random random;

    public Questions() {
        random = new Random();
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;

        if (random.nextBoolean()) {
            answer = num1 + num2;
            System.out.println("What is " + num1 + " + " + num2 + "?");
        } else {
            answer = num1 - num2;
            System.out.println("What is " + num1 + " - " + num2 + "?");
        }
    }
    public boolean checkAnswer(int answer) {
        return this.answer == answer;
    }
}
