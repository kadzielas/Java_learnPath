package lambda;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Magda");
        arr.add("Ola");
        arr.add("Dominika");
        arr.add("Kinga");
        arr.add(null);
        arr.add("Agnieszka");

        System.out.println(arr);

        arr.removeIf(e -> e == null || e.equalsIgnoreCase("dominika"));
        System.out.println(arr);

    }
}
