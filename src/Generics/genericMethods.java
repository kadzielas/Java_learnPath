package Generics;

import java.util.ArrayList;

class Util{
    public static <E> E getLastElement(ArrayList<E> arr){
        return arr.get(arr.size() - 1);
    }

    public static <X> void printData(ArrayList<X> list){
        for (int i = 0; i < list.size(); i++) {
            X element = list.get(i);
            System.out.println(element);
        }
    }
}

public class genericMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(30);
        arr.add(45);
        System.out.println("Last element: " + Util.getLastElement(arr));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("My");
        arrayList.add("name");
        arrayList.add("is");
        arrayList.add("Sebastian");

        System.out.println("\narr list");
        Util.printData(arr);
        System.out.println("\narrayList list:");
        Util.printData(arrayList);
    }
}
