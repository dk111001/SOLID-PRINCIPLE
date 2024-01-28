package observer;

public class FeedUpdater implements VideoUploadedSubscriber{
    FeedUpdater(){
        YouTube youTube = YouTube.getInstance();
        youTube.registerSubscriber(this);
    }

    public ReturnData videoUploadedEvent(){
        System.out.println("User feed updated");
        return new ReturnData("User feed updated");
    }
}
