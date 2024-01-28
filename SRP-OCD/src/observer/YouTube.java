package observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube {
    private static YouTube instance = null;
    private List<VideoUploadedSubscriber> videoUploadedSubscriberList;
    private YouTube(){
        videoUploadedSubscriberList = new ArrayList<>();
    }

    public static YouTube getInstance(){
        if(instance == null){
            synchronized (YouTube.class){
                if(instance == null){
                    instance = new YouTube();
                }
            }
        }
        return instance;
    }

    public void registerSubscriber(VideoUploadedSubscriber videoUploadedSubscriber){
        videoUploadedSubscriberList.add(videoUploadedSubscriber);
    }

    public void deRegisterSubscriber(VideoUploadedSubscriber videoUploadedSubscriber){
        videoUploadedSubscriberList.remove(videoUploadedSubscriber);
    }

    public void videoUploaded(){
        for(VideoUploadedSubscriber videoUploadedSubscriber:videoUploadedSubscriberList){
            videoUploadedSubscriber.videoUploadedEvent();
        }
    }


}
