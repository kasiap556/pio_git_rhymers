package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] numbers = new int[12];

    private int top = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++top] = in;
    }

    protected boolean callCheck() {
        return top == -1;
    }

    protected boolean isFull() {
        return top == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[top];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[top--];
    }
}
