package People;

public abstract class Staff extends Person{
    private RankType rank;

    public Staff(String staffName, RankType staffRank){
        super(staffName);
        this.rank = staffRank;
    }
    public RankType getRank() {
        return rank;
    }
}
