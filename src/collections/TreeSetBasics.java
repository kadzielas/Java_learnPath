package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(21);
        treeSet.add(12);
        treeSet.add(43);
        treeSet.add(19);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n");

        Iterator<Integer> iteratorBack = treeSet.descendingIterator();
        while (iteratorBack.hasNext()){
            System.out.println(iteratorBack.next());
        }

    }
}
