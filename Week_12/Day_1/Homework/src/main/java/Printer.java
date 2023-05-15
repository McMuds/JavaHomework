public class Printer {
    private int sheetCount;

    public Printer(){
        this.sheetCount = 0;
    }

    public int getSheetCount(){
        return this.sheetCount;
    }

    public void setSheetCount(int numOfSheets){
        this.sheetCount = numOfSheets;
    }

    public void print(int copies, int sheets){
        int required = copies * sheets;
        if (required <= this.sheetCount) {
            this.sheetCount -= required;
        }
    }
}
