package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Animal {
    protected String name;
    protected int age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }
}
class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age);
    }
}
class Zoo<T extends Animal>{
    private ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal(T animal){
        animals.add(0,animal);
    }
    public void printAllAnimals(){
        Iterator<T> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

public class ChallangeZoo {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Animal("Borys", 12));
        zoo.addAnimal(new Animal("Greg", 16));

        zoo.printAllAnimals();
    }
}
