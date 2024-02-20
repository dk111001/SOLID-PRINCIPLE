package factory_new;

public class MSIMonitor implements Monitor{
    private String name;
    public MSIMonitor() {
        name = "MSIMonitor";
    }

    public String printName() {
        return name;
    }
}
