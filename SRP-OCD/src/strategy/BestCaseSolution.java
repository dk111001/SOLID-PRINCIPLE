package strategy;


public class BestCaseSolution implements Solution{

    private static BestCaseSolution instance = null;
    public void findSolution(){
        System.out.println("Best Case Solution");
    }

    public static BestCaseSolution getSingleton(){
        if(instance == null) {
            synchronized (BestCaseSolution.class){
                if(instance == null){
                    instance = new BestCaseSolution();
                }
            }
        }
        return instance;
    }
}
