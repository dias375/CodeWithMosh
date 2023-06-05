package dev.dias375;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

//        var test = new BracketsBalanceCheck();
//        System.out.println(test.run("aaa[][]()"));

        var tree = new PriorityQueue<Integer>(Comparator.reverseOrder());

        tree.add(1);
        tree.add(132);
        tree.add(321);
        tree.add(13);
        tree.add(143);
        tree.add(1435);
        tree.add(5651);
        tree.add(166);

        System.out.println(tree.toString());
        System.out.println(tree.poll());
        System.out.println(tree.toString());

    }

}