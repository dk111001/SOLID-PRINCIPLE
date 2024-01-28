package strategy;

public class WorstCaseSolution implements Solution{
    private static WorstCaseSolution instance = null;
    public void findSolution(){
        System.out.println("Worst Case Solution");
    }

    public static WorstCaseSolution getSingleton(){
        if(instance == null) {
            synchronized (WorstCaseSolution.class){
                if(instance == null){
                    instance = new WorstCaseSolution();
                }
            }
        }
        return instance;
    }
}
