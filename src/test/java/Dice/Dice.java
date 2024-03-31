package Dice;
import org.junit.Test;
public class Dice {
    @Test
    public int testRoll(){
        int numberOfDice=2;
        Dice dice=new Dice(numberOfDice);
        int max=numberOfDice*6;
       Integer actual=dice.roll();

    }





}
