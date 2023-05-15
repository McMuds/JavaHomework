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
        printer.print(3,5);
        assertEquals(0, printer.getSheetCount());
    }
    @Test
    public void printerCannotPrint(){
        printer.setSheetCount(10);
        printer.print(3,5);
        assertEquals(10, printer.getSheetCount());
    }
}
