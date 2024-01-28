package Bird;

class Pigeon extends Bird implements Flyable, Soundable{
    public void breathe(){
        System.out.println("Pigeon breathe");
    }

    public void fly(){
        System.out.println("Pigeon Fly");
    }

    public void makeSound(){
        System.out.println("Pigeon Sound");
    }
}

class Penguin extends Bird implements Soundable{
    public void breathe(){
        System.out.println("Penguin breathe");
    }

    public void makeSound(){
        System.out.println("Penguin Sound");
    }
}

class Crow extends Bird implements Flyable, Soundable{
    public void breathe(){
        System.out.println("Crow breathe");
    }

    public void fly(){
        System.out.println("Crow Fly");
    }

    public void makeSound(){
        System.out.println("Crow Sound");
    }
}



public class Client {
    public static void main(String[] args){
        Flyable crow = new Crow();
        crow.fly();
        Flyable pigeon = new Pigeon();
        pigeon.fly();
    }
}
