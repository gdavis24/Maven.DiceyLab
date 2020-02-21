import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Simulation {

    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());
    public Integer numOfDie;
    public Integer numOfRolls;
    public Integer high;
    public Integer low;
    public Bins bin;

    public Simulation(Integer numOfDie, Integer numOfRolls){
        this.numOfDie = numOfDie;
        this.numOfRolls = numOfRolls;
        this.low = numOfDie;
        this.high = numOfDie*6;
        this.bin = new Bins(low, high);
    }

    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }

    public void runSimulation() {
        Dice d = new Dice(numOfDie);
        int i = 0;
        while(i<numOfRolls){
            bin.incrementBin(d.tossAndSum());
            i++;
        }


    }

    private String printResults() {
        String header = String.format("***\nSimulation of %s dice tossed for %s times.\n***", numOfDie.toString(), numOfRolls.toString());
        LOGGER.info(header);
        String result = "";
        String rollResult = "";
        int possibilities = 1;

        for(int i = low; i <= high; i++){
            Integer x = bin.getBin(i);

            if (possibilities <= 8) {

                possibilities++;
                result += possibilities + "  :";

            }
            else {
                possibilities++;
                result += possibilities + " :";


            }
            int percent = (x*100) /numOfRolls;
            String star = "";
            for(int j = 1; j <= percent; j++) {
                star += "*";
            }



//            String body = String.format("%s : %s : %s %s", possibilities, x.toString(), percent, star);
//            LOGGER.info(body);
//            System.out.println(body);
//            if ( x < 100000){
//                rollResult += x + "  " + "\n";
//            }
//            else {
//                rollResult += x + " " + "\n";
//            }
            result += x + "\n";
        }
        System.out.println(result);
        return result;

    }


}