
import java.util.Random;
import java.util.logging.Logger;

public class Dice {
    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    Integer rolls;

    public Dice(Integer rolls) {
        this.rolls = rolls;

    }


    public Integer tossAndSum() {
        int sides = 6;
        Integer sum = 0;
        int i = 1;
        while (i <= rolls) {
            Integer die = (int) (Math.random() * sides) + 1;
            sum += die;
            i++;
        }

        return sum;
    }

    public Integer getRolled(){
        return rolls;
    }


}
