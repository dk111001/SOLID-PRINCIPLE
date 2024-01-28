package observer;

public class UserNotifier implements VideoUploadedSubscriber{
    UserNotifier(){
        YouTube youTube = YouTube.getInstance();
        youTube.registerSubscriber(this);
    }

    public ReturnData videoUploadedEvent(){
        ReturnData data = new ReturnData("User Notified");
        System.out.println("User Notified");
        return data;

    }
}
