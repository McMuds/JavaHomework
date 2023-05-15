import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printerHasNoSheets(){
        assertEquals(0, printer.getSheetCount());
    }

    @Test
    public void printerCanSetSheets(){
        printer.setSheetCount(15);
        assertEquals(15, printer.getSheetCount());
    }

    @Test
    public void printerCanPrint(){
        printer.setSheetCount(15);
        printer.setTonerCount(15);
        printer.print(3,5);
        assertEquals(0, printer.getSheetCount());
    }
    @Test
    public void printerCannotPrint(){
        printer.setSheetCount(10);
        printer.setTonerCount(11);
        printer.print(3,5);
        assertEquals(10, printer.getSheetCount());
    }

    @Test
    public void hasToner(){
        printer.setSheetCount(15);
        printer.setTonerCount(10);
        assertEquals(10, printer.getTonerCount());
    }

    @Test
    public void tonerReduces(){
        printer.setSheetCount(15);
        printer.setTonerCount(10);
        printer.print(2,4);
        assertEquals(2,printer.getTonerCount());
    }

    @Test
    public void printerCannotPrintBecauseNoToner(){
        printer.setSheetCount(16);
        printer.setTonerCount(10);
        printer.print(3,4);
        assertEquals(16,printer.getSheetCount());
        assertEquals(10, printer.getTonerCount());
    }
}
