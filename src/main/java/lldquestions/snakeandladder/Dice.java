package lldquestions.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int min = 1;
    int max = 6;
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        return ThreadLocalRandom.current().nextInt(min,max+1) * ThreadLocalRandom.current().nextInt(1,3);
    }

}
