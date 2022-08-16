package neww;

import java.util.HashSet;

public class InsertIntegers {

    public static void main(String[] args) {
        //Insert group of Integers

        HashSet<Integer> hs = new HashSet<>();
        int arr[] = {1,4,6,7,454,78,3,23,6,787,2,0,9};
        for (int i=0;i<arr.length;i++) {
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }
}
