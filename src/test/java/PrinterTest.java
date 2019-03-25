import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    private Printer printer;


    @Before
    public void before() {
        this.printer = new Printer(100, 2000);
    }

    @Test
    public void hasPaperLeft() {
        assertEquals(100, printer.paperLeft());
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(2000, printer.tonerVolume());
    }

    @Test
    public void hasCopiesToBeMade_hasEnoughPaper() {
        printer.copiesToBeMade(2,10);
        assertEquals(80, printer.paperLeft());
        assertEquals(1980, printer.tonerVolume());
    }
    @Test
    public void hasCopiesToBeMade_notEnoughPaper() {
        printer.copiesToBeMade(200,10);
        assertEquals(100, printer.paperLeft());
        assertEquals(2000, printer.tonerVolume());
    }

    @Test
    public void canRefillPaper() {
        printer.refillPaper(200);
        assertEquals(200, printer.paperLeft());
    }


}
