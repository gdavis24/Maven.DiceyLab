import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class TestDice{
    private static final Logger LOGGER = Logger.getLogger(TestDice.class.getName());

    @Test
    public void diceConstructorTest(){
        Dice dice = new Dice(5);
        Integer expected = 5;

        Assert.assertEquals(expected, dice.getRolled());
    }

    @Test
    public void diceConstructorTest1(){
        Dice dicey = new Dice(2);
        Integer expected = 2;

        Assert.assertEquals(expected, dicey.getRolled());
    }


    @Test
    public void tossAndSumTest(){
        Dice dice1 = new Dice(2);
        Integer actual = dice1.tossAndSum();

        Assert.assertTrue(actual >= 2 && actual <= 12);
    }

    @Test
    public void tossAndSumTest1(){
        Dice dice2 = new Dice(4);
        Integer actual = dice2.tossAndSum();

        Assert.assertTrue(actual >= 4 && actual <= 24);
    }

}