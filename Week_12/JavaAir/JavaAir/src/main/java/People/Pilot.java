package People;

import Enums.RankType;

public class Pilot extends Staff{

    private String licenceNumber;
    public Pilot(String pilotName, RankType pilotRank, String licenceNumber){
        super(pilotName, pilotRank);
        this.licenceNumber = licenceNumber;
    }
    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyThePlane(){
        return "Wheeee!!! Look ma - no hands!";
    }
}
