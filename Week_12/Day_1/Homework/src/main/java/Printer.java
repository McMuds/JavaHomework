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
}
