package STRATEGY;

import java.util.Arrays;

public interface SortHandle {
    public int length();
    public boolean outOfOrder(int index);
    public void swap(int index);
    public void setArray(Object Array);
}

class IntSortHandle implements SortHandle {
    private int[] array;

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public boolean outOfOrder(int index) {
        return (array[index] > array[index + 1]);
    }

    @Override
    public void swap(int index) {
        int temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }

    @Override
    public void setArray(Object itsArray) {
        array = (int[]) itsArray;
    }

    public static void main(String[] args) {
        int[] intArr = new int[]{2,4,2,234234,234234,23,12,312,3,1,51,523,5124,512,5,23,1,12,31};
        BubbleSorter bubbleSorter = new BubbleSorter(new IntSortHandle());
        bubbleSorter.sort(intArr);
        System.out.println("intArr: " + Arrays.toString(intArr));
    }
}