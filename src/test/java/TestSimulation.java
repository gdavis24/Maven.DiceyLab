import org.junit.Test;

import java.util.logging.Logger;

public class TestSimulation {
    private static final Logger LOGGER = Logger.getLogger(TestSimulation.class.getName());
    @Test
    public void testRunSim() {
        // When
        Simulation sim = new Simulation(2, 10);

        sim.runSimulation();


        //System.out.println();
        // Then

    }
}