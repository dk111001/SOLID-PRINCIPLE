package observer;

public class Client {
    public static void main(String[] args){
        YouTube youTube = YouTube.getInstance();
        UserNotifier userNotifier = new UserNotifier();
        FeedUpdater feedUpdater = new FeedUpdater();
        youTube.deRegisterSubscriber(userNotifier);
        youTube.videoUploaded();
    }

}
