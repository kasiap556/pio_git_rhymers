package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int top = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++top] = in;
    }

    public boolean callCheck() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[top];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[top--];
    }

}
