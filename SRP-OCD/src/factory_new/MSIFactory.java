package factory_new;

public class MSIFactory extends Company {
    public GPU createGPU() {
        return new MSIGPU();
    }

    public Monitor createMonitor() {
        return new MSIMonitor();
    }
}
