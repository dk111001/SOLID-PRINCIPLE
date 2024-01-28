package factory;

public class UiFactoryFactory {
    public static UiFactory createUiFactory(SupportedPlatform supportPlatform){
        return switch (supportPlatform) {
            case ANDROID -> new AndroidFactory();
            case IOS -> new IosFactory();
            default -> null;
        };
    }
}
