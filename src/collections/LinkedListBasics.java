package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Patryk";
        list.add(p1);
        list.addFirst("Jakub");
        list.addLast("Dominik");

        System.out.println("List: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("After remote first and last element: " + list);

        System.out.println(list.contains(p1));

        list.add("Daniel");
        list.add("Piotrek");
        list.add(p1);
        list.add("Magda");

        list.removeFirstOccurrence(p1);
        list.removeLastOccurrence("Piotrek");

        System.out.println("List after remove Occurrence: " + list);

        list.add(2,"Zenon");
        list.set(0, "Karol");
        System.out.println(list.size());

        ListIterator<String> iterator1 = list.listIterator();
        while (iterator1.hasNext()){
            String str = iterator1.next();
            System.out.println(str);
        }

        /*
        Karol
        Daniel
        Zenon
        Patryk
        Magda
         */
        System.out.println(" ");

        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()){
            String str = iterator2.previous();
            System.out.println(str);
        }

    }
}
