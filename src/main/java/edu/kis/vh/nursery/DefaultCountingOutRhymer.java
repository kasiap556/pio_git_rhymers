package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int maxStack = 12;
    public static final int topStack = -1;
    private final int[] numbers = new int[maxStack];

    public int top = topStack;

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
