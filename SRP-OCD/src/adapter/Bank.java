package adapter;

public interface Bank {
    double getBalance();
    boolean authenticate();
    boolean transaction();
}
