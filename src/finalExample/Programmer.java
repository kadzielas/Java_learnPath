package finalExample;

public class Programmer extends  Employee{
    String languages;

    Programmer(String name, String surname, String languages){

        this.name = name;
        this.surname = surname;
        this.languages = languages;
    }
    public void printInfo(){
        System.out.println(this.name + " " + this.surname + " " + this.languages);
    }
}
