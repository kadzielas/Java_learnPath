package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
class Employee extends Person{
    private String jobTitle;

    @Override
    public String toString() {
        return "Employee{" +
                "name: " + this.getName() + " " +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
class Organistaion<T extends Person>{
    private ArrayList<T> participants;

    public Organistaion(){
        participants = new ArrayList<T>();
    }
    public void addParticipant(T x){
        participants.add(x);
    }
    public T getParticipant(int index){
        return participants.get(index);
    }
    public void printParticipants(){
        Iterator<T> iterator= participants.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Contractor extends Employee{
    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    @Override
    public String toString() {
        return "Contractor{ " + super.toString() +"}";
    }
}

public class organisationExample {
    public static void main(String[] args) {

        Organistaion<Employee> organistaion = new Organistaion<>();
        organistaion.addParticipant(new Employee("Sebastian", "Service Desk"));
        organistaion.addParticipant(new Employee("Damian", "IT specialist"));
        organistaion.addParticipant(new Employee("Adam", "Java developer"));
        organistaion.addParticipant(new Contractor("Dawid", "Network manager"));

        organistaion.printParticipants();
    }
}
