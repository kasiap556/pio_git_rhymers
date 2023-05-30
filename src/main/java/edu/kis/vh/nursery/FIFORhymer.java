package edu.kis.vh.nursery;

/**
 * dokumentacja klasy
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    /**
     * dokumentacja zmiennej
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    /**
     * dokumentacja metody
     */
    @Override
    protected int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
