package People;

import Enums.RankType;

public class CabinCrew extends Staff{

    public CabinCrew(String ccName, RankType ccRank){
        super(ccName, ccRank);
    }

    public String relayMessage(String message){
        String result = "This is " + this.getName() + " with a message from the cockpit: ";
        if (message != null){
            result += message;
        }
        return result;
    }
}
