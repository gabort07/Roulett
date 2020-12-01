package Brainstorming;

public enum Exitcode {

    A(104), B(203);

    private int numVal;

    Exitcode(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

}
