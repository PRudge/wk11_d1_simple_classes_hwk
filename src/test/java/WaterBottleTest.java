import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterBottle;


    @Before
    public void before(){
        this.waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

   @Test
    public void canTakeADrink() {
        waterBottle.takeADrink(10);
        assertEquals(90, waterBottle.getVolume());
        waterBottle.takeADrink(10);
        assertEquals(80, waterBottle.getVolume());
        waterBottle.takeADrink(10);
        assertEquals(70, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle() {
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillBottle() {
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
