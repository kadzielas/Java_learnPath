package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

class Animal2 {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        String names[] = {"Dog", "Cat", "Tiger", "Lion", "Panda"};

        LinkedList<Animal> animals = new LinkedList<>();


        for (int i = 0; i < 20; i++){
            String randEl = names[(int)Math.floor(Math.random() * names.length)];
            animals.add(new Animal(randEl));
        }
        animals.removeLast();
        animals.removeFirst();
        animals.addFirst(new Animal("Tiger"));
        animals.addLast(new Animal("Lion"));

        ListIterator<Animal> iterator = animals.listIterator();
        while (iterator.hasNext()){
            Animal str = iterator.next();
            System.out.println(str);


        }

    }
}
