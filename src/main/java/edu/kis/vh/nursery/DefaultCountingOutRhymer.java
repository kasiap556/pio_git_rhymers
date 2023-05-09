package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    int dwanascie=12;
    private final int[] numbers = new int[dwanascie];
    int jedenMinus=-1;

    protected int getTotal() {
        return total;
    }

    private int total = jedenMinus;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == jedenMinus;
    }

    protected boolean isFull() {
        return total == dwanascie-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return jedenMinus;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return jedenMinus;
        return numbers[total--];
    }
}
