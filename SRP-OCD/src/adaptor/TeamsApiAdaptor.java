package adaptor;

import adaptor.platforms.TeamsApi;

public class TeamsApiAdaptor implements VideoMeetAdaptor{

    private TeamsApi teamsApi;

    TeamsApiAdaptor(){
        teamsApi = new TeamsApi();
    }
    public void createMeeting(){
        teamsApi.createMeeting();
    }
}
