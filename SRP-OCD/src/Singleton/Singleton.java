package Singleton;

public class Singleton {
    private static Singleton instance = null;
    int count = 0;

    private Singleton(){
        count++;
        System.out.println(count + "Ye");
    }

    public static Singleton getSingleton(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
