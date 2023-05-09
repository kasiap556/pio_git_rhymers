package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    int tableSize = 12;
    private final int[] numbers = new int[tableSize];
    int returnValue =-1;

    protected int getTotal() {
        return total;
    }

    private int total = returnValue;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == returnValue;
    }

    protected boolean isFull() {
        return total == tableSize -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return returnValue;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return returnValue;
        return numbers[total--];
    }
}
