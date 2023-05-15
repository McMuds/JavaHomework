public class WaterBottle {
    private double volume;

    public WaterBottle(){
        this.volume = 100.0;
    }
    public double getVolume(){
        return this.volume;
    }

    public void drink(){
        double newVolume = (this.volume <= 0.0) ? 0.0 : this.volume - 10.0;
        this.volume = newVolume;
    }

    public void emptyBottle(){
        this.volume = 0.0;
    }

    public void fillBottle(){
        this.volume = 100.0;
    }
}
