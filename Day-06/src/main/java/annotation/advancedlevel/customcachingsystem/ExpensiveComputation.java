package annotation.advancedlevel.customcachingsystem;

public class ExpensiveComputation {

    // Simulate a computationally expensive method
    @CacheResult  // Mark the method for caching
    public int compute(int a, int b) {
        try {
            Thread.sleep(3000);  // Simulate delay (expensive computation)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return a + b;  // Return the computed result
    }
}

