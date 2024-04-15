package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorManipulation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Adam");
        String p1 = "Patryk";
        list.add(p1);
        list.addFirst("Jakub");
        list.addLast("Dominik");

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            if (str.equalsIgnoreCase("Adam")) {
                iterator.set("Zuza");
            }
            if (str.equalsIgnoreCase("Patryk")) {
                iterator.add("Jimmy");
            }
            if (str.equalsIgnoreCase("Dominik")){
                iterator.remove();
            }
        }
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
