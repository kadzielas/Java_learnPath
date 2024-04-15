package finalExample;

public class Employee {
    String name;
    String surname;

    Employee(){

    }

    Employee(String name, String surname){

        this.name = name;
        this.surname = surname;

    }

    public void printInfo(){
        System.out.println(this.name + " " + this.surname);
    }

    public static void main(String[] args) {

    }
}


