package adapter;

public class ICICIBank implements Bank{
    public double getBalance() {
        return 12.0;
    }
    public boolean authenticate() {
        return true;
    }

    public boolean transaction() {
        return true;
    }
}
