package desantisenterprise.ascabcapoeirahub;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Broderick on 9/22/2016.
 */

public class Movement {
    private String movementName;
    private int gifLink;
    private String beltList;

    //private static final String JSON_MOVEMENT = "movement name";
    //private static final String JSON_GIF = "gif Link";
    //private static final String JSON_BELT = "belt List";

    public Movement(String m, int g, String b){
        movementName = m;
        gifLink = g;
        beltList = b;
    }

    public Movement(String m, String b){
        movementName = m;
        gifLink = R.drawable.placeholder;
        beltList = b;
    }

    public Movement getMovement(){return this;}
    public String getMovementName(){
        return movementName;
    }
    public int getGifLink(){
        return gifLink;
    }
    public String getBeltList(){
        return beltList;
    }

    public void setMovementName(String m){
        movementName = m;
    }
    public void setGifLink(int g){
        gifLink = g;
    }
    public void setBeltList(String b){ beltList = b; }

}
