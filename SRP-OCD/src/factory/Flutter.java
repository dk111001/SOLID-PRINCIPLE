package factory;

public class Flutter {

    private SupportedPlatform supportPlatform;

    Flutter(SupportedPlatform supportPlatform){
        this.supportPlatform = supportPlatform;
    }
    public void setTheme(){
        System.out.println("Setting theme");
    }

    public UiFactory createFactory(){
        return UiFactoryFactory.createUiFactory(this.supportPlatform);
    }
}
