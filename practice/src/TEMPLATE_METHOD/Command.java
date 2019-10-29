package TEMPLATE_METHOD;

import java.util.Arrays;

public class Command {
    public static void main(String args[]) {
        int[] intArr = new int[]{2,4,2,234234,234234,23,12,312,3,1,51,523,5124,512,5,23,1,12,31};
        double[] doubleArr = new double[]{1.21,23.12,1.2, .123, 22.3, 1231231.12,1.2,3213.2,123.1};
        IntBubbleSorter intBubbleSorter = new IntBubbleSorter();
        DoubleBubbleSorter doubleBubbleSorter = new DoubleBubbleSorter();
        int intO = intBubbleSorter.sort(intArr);
        int intD = doubleBubbleSorter.sort(doubleArr);
        System.out.println("intO: " + intO);
        System.out.println("intD: " + intD);
        System.out.println("intArr: " + Arrays.toString(intArr));
        System.out.println("doubleArr: " + Arrays.toString(doubleArr));

    }
}
