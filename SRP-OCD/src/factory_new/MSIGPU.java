package factory_new;

public class MSIGPU implements GPU{
    private String name;
    public MSIGPU() {
        name = "MSIGPU";
    }

    public String printName() {
        return name;
    }
}
