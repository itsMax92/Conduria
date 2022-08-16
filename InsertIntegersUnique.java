package neww;

import java.util.HashSet;

public class InsertIntegersUnique {

    public static void main(String[] args) {
        //Insert group of Integers Which are unique

        HashSet<Integer> hs = new HashSet<>();
        int n = 15;
        for (int i=0;i<n;i++) {
            hs.add(i);
        }

        System.out.println(hs);
    }
}
