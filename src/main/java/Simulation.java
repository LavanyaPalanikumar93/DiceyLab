public class Simulation {
    int numberOfDice;
    int numberOfToss;
    Bins bins;
    public Simulation(int numberOfDice, int numberOfToss) {
        this.numberOfDice = numberOfDice;
        this.numberOfToss = numberOfToss;
        this.bins = new Bins(this.numberOfDice, this.numberOfToss * 6);
    }
    public void run() {
        Dice dice = new Dice(this.numberOfDice);
        bins = new Bins(this.numberOfDice, this.numberOfDice * 6);
        for (int i = 0; i < this.numberOfToss; i++) {
            bins.incrementBins(dice.roll());
        }
    }
    public void print() {
        System.out.println("***");
        System.out.println("Simulation of " + this.numberOfDice + " dice tossed for " + numberOfToss + " times");
        System.out.println("***");
        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            String str = String.format("%2d :%8d:  %1.2f", i, bins.getBin(i), (double) this.bins.getBin(i) / numberOfToss);
            double percent = (double) this.bins.getBin(i) / this.numberOfToss;
            int num = (int) (percent * 100);
            String var = "*".repeat(num);
            System.out.println(str + " " + var);
        }
    }
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);
        sim.run();
        sim.print();
    }
}