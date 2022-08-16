package neww;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i=0;i<=n;i++) {
            al.add(i);
        }

        System.out.println(al);
    }
}
