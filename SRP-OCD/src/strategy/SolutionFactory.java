package strategy;

public class SolutionFactory {
    public static Solution getSolution(SolutionType solutionType){
        return switch (solutionType) {
            case BEST_CASE -> BestCaseSolution.getSingleton();
            case WORST_CASE -> WorstCaseSolution.getSingleton();
            default -> null;
        };
    }
}
