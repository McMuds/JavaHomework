public enum BasketItem {
    BREAD("Bread", 1.95, Category.BAKERY),
    EGGS("Eggs", 2.50, Category.FOODCUPBOARD),
    WINE("Wine", 10.99, Category.WINE),
    BEER("Beer", 6.00, Category.BEER),
    PEANUTBUTTER("Peanut Butter", 3.50, Category.JAMS),
    MAGNUMS("Magnum", 4.00, Category.FROZEN),
    CHICKEN("Chicken", 7.50, Category.MEAT),
    YOGHURT("Yoghurt", 2.50, Category.DAIRY);


    private final String nameOfItem;
    private final Double costOfItem;
    private Category categoryOfItem;

    BasketItem(String nameOfItem, Double costOfItem, Category category){
        this.categoryOfItem = category;
        this.costOfItem = costOfItem;
        this.nameOfItem = nameOfItem;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public Double getCostOfItem() {
        return costOfItem;
    }

    public Category getCategoryOfItem() {
        return categoryOfItem;
    }
}