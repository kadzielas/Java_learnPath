package Inheritance.super_example;

public class SuperTest {
    public static void main(String args[]){
        Student student = new Student("Sebastian", "Brutus", 5);
        Teacher teacher = new Teacher("Robert", "Najmoła", "Math");
        Director director = new Director("Terska", "Zienkiewcz", 222);

        System.out.println(teacher.getTeachingSubject());
    }
}
