package STRATEGY;

public class BubbleSorter {
    private int operations = 0;
    protected int length;
    private SortHandle sortHandle;

    public BubbleSorter(SortHandle itSortHandle) {
        sortHandle = itSortHandle;
    }

    public int sort(Object array) {
        sortHandle.setArray(array);
        length = sortHandle.length();
        if (length <= 1) {
            return operations;
        }

        for (int i = length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (sortHandle.outOfOrder(k)) {
                    sortHandle.swap(k);
                }
                operations++;
            }
        }

        return operations;
    }
}
