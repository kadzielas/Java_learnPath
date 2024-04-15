package collections;

import java.util.ArrayList;

public class ArrayListChallenge {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.println("First element: " + names.get(0));

        names.set(2,"Olek");

        names.add(1,"Karol");

        names.remove(0);

        for (String x : names){
            System.out.println(x);
        }
    }
}
