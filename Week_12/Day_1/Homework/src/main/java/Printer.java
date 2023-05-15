public class Printer {
    private int sheetCount;
    private int tonerCount;

    public Printer(){
        this.sheetCount = 0;
        this.tonerCount = 0;
    }

    public int getSheetCount(){
        return this.sheetCount;
    }

    public int getTonerCount(){
        return this.tonerCount;
    }
    public void setSheetCount(int numOfSheets){
        this.sheetCount = numOfSheets;
    }

    public void setTonerCount(int tonerCount) {
        this.tonerCount = tonerCount;
    }

    public void print(int copies, int sheets){
        int required = copies * sheets;
        if (required <= this.sheetCount && required <= this.tonerCount) {
            this.sheetCount -= required;
            this.tonerCount -= required;
        }
    }
}
