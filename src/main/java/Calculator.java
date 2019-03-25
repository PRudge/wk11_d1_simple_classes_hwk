public class Calculator {
    private int firstNum;
    private int secondNum;
//
//    // initialise function (constructor function, returning a new instance of the class

    public Calculator(int firstNum, int secondNum){ // this returns a Calculator
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
//
//
//    // getter
    public int getFirstNum() {
        return this.firstNum;
    }

    public int getSecondNum() {
        return this.secondNum;
    }

    public int add(){
        return (this.firstNum + this.secondNum);
    }

    public int subtract(){
        return (this.firstNum - this.secondNum);
    }

    public int multiply(){
        return (this.firstNum * this.secondNum);
    }

    public int divide(){
        return (this.firstNum / this.secondNum);
    }



}
