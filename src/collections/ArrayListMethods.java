package collections;

import java.util.ArrayList;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListMethods {
    public static void main(String[] args) {

        Person p1 = new Person("Adam");
        Person p2 = new Person("Sebek");
        Person p3 = new Person("Przemek");
        Person p4 = new Person("Krid");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);
        arr1.add(p4);

        System.out.println("\n arr1 ArrayList");
        for (Person p : arr1){
            System.out.println(p);
        }

        Person p5 = new Person("Artur");
        Person p6 = new Person("Kacper");
        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p5);
        arr2.add(p6);

        arr1.addAll(arr2);
        System.out.println("\n after add collection arr2 to arr1: ");
        for (Person p : arr1){
            System.out.println(p);
        }

        if (arr1.contains(p5)){
            System.out.println("\n arr1 contain p5");
        }

        if (arr1.containsAll(arr2)){
            System.out.println("\n arr1 contain arr2");
        }

        Person p7 = new Person("Maciek");
        arr2.add(p7);

        if (arr1.containsAll(arr2)){
            System.out.println("\n arr1 contain arr2 - version with p7");
        } else {
            System.out.println("\n arr1 doesn't contain arr2 :(");
        }

        arr2.remove(p7);
        if (arr1.containsAll(arr2)){
            System.out.println("\n arr1 contain arr2 - version after remove p7");
        }

        arr1.removeAll(arr2);
        System.out.println("\n arr2 has been removed from arr1");
        for (Person p : arr1){
            System.out.println(p);
        }

        Person people[] = new Person[arr1.size()];
        people = arr1.toArray(people);
        System.out.println(people.length);

        arr1.clear();
        if (arr1.isEmpty()){
            System.out.println("\n arr1 is empty :(");
        }
    }
}
