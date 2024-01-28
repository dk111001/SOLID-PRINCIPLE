package strategy;

public class Client {
    public static void main(String[] args){
        RainWaterTrapping R = new RainWaterTrapping();
        R.findSolution(SolutionType.WORST_CASE);
    }
}
