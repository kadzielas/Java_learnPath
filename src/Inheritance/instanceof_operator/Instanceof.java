package Inheritance.instanceof_operator;

class Animal {
    protected String name;
    protected float weight;
    protected int numLegs;

}

class Dog extends Animal {
    protected void bark(){
        System.out.println("BARK! BARK!");
    }
}

class Bird extends Animal {
    protected void fly(){
        System.out.println("Flying bird");
    }
}

public class Instanceof {
    public static void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Dog;
        System.out.println(result);
    }
}
