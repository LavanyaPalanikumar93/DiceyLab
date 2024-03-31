import java.util.Random;
public class Dice {
public int numberOfDice;
public Dice(){

}
public Dice(int numberOfDice)
{
    this.numberOfDice=numberOfDice;
}
Random random=new Random();

public int roll(){
   int sum=0;
   for(int i=0;i<this.numberOfDice;i++){
        sum+= random.nextInt(6)+1;
   }
return sum;
}
}

