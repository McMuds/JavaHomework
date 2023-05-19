package Enums;

public enum BaggageType {
    SMALL(4),
    MEDIUM(10),
    LARGE(15),
    XLARGE(23),
    OVERSIZE(30);

    private int bagWeight;

    BaggageType(int weight){
        this.bagWeight = weight;
    }

    public int getBaggageWeight() {
        return bagWeight;
    }
}
