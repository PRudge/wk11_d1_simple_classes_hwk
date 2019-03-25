public class Printer {
    private int paperLeft;
    private int tonerVolume;


    public Printer(int paperLeft, int tonerVolume) { // this returns a Printer
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    //    // getter
    public int paperLeft() {
        return this.paperLeft;
    }

    //    // getter
    public int tonerVolume() {
        return this.tonerVolume;
    }

    public void copiesToBeMade(int pages, int numCopies) {
        int numPages = pages * numCopies;
        if (numPages <= this.paperLeft) {
            this.paperLeft -= numPages;
            this.tonerVolume -= numPages;
        }
    }

    public void refillPaper(int sheets) {
        this.paperLeft = sheets;
    }


}




