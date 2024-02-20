package adapter;

public class Client {
    public static void main(String[] args) {
        Bank bank = new YesBank();

        bank.authenticate();
    }
}
