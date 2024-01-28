package adaptor;

import adaptor.platforms.GoogleMeetApi;
import adaptor.platforms.TeamsApi;

public class GoogleMeetApiAdaptor implements VideoMeetAdaptor{
    private GoogleMeetApi googleMeetApi;

    GoogleMeetApiAdaptor(){
        googleMeetApi = new GoogleMeetApi();
    }
    public void createMeeting(){
        googleMeetApi.createMeeting();
    }
}
