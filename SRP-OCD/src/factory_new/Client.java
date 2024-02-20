package factory_new;

public class Client {
    public static void main(String[] args) {
        Company msi = new MSIFactory();
        GPU msiGPU = msi.createGPU();
        Monitor msiMonitor = msi.createMonitor();
        System.out.println(msiGPU.printName());
        System.out.println(msiMonitor.printName());
    }
}
