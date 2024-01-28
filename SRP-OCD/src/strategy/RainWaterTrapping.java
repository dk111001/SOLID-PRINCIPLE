package strategy;

public class RainWaterTrapping {
    public void findSolution(SolutionType solutionType){
        Solution S = SolutionFactory.getSolution(solutionType);
        S.findSolution();
    }
}
