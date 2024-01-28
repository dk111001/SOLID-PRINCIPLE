package Singleton;

public class Client {
    public static void main(String[] args){
        Singleton obj = Singleton.getSingleton();
        System.out.println(obj.count);
        obj.count = 15;
        Singleton newObj = Singleton.getSingleton();
        System.out.println(newObj.count);
    }
}
