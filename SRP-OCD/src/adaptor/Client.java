package adaptor;

public class Client {
    public static void main(String[] args){
        VideoMeetAdaptor newMeeting = new TeamsApiAdaptor();
        newMeeting.createMeeting();
    }
}
