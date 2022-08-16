package neww;


import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {

    public static void main(String[] args) {

        Queue<Integer> qq = new LinkedList<>();
        int n = 6;
        for (int i=1;i<=n;i++) {
            qq.add(i);
            System.out.println("Adding " +i);
        }

        System.out.println(qq);
        System.out.println("Removing " +qq.remove());
        System.out.println("Removing " +qq.remove());
        System.out.println(qq);
    }
}
