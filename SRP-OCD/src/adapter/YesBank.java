package adapter;

public class YesBank implements Bank{
    public double getBalance() {
        return 10.0;
    }
    public boolean authenticate() {
        return true;
    }

    public boolean transaction() {
        return true;
    }
}
