public class WaterBottle {
    private int volume;

    //    // initialise function (constructor function, returning a new instance of the class

    public WaterBottle(int volume){ // this returns a WaterBottle
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void takeADrink(int sip) {
        this.volume -= sip;
    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }

}
