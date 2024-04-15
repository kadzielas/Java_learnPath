package Inheritance.polymorphism_basics;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;



    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(){
        name = "unknown";
        jobTitle = "unknown";
        salary = 5000;

    }

    public void doWork() {
        System.out.println("Doing work");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void printInfo(){
        System.out.println("Employee: " + name);

    }

}
class Manager extends Employee{
    private  String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void printInfo(){
        System.out.println("Manager: " + getName());
    }

    public Manager() {
        super();
        departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee(){
        System.out.println("Employee hired");
    }

    public void giveRise(Employee employee){
        System.out.println("Employee got rise");
    }

}

    class Ceo extends Manager {
    private int sharesNumber;

        public int getSharesNumber() {
            return sharesNumber;
        }

        public void setSharesNumber(int sharesNumber) {
            this.sharesNumber = sharesNumber;
        }

        public Ceo() {
            sharesNumber = 100;
        }

        public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
            super(name, jobTitle, salary, departmentName);
            this.sharesNumber = sharesNumber;
        }

        public void printInfo(){
            System.out.println("CEO: " + getName());
        }

        public void signContract(){
        System.out.println("Contract signed");


    }
    }

public class Company {
    public static void main(String[] args) {

        Employee employee = new Employee("Brutus", "Programmer", 5500);
        Manager manager = new Manager("Hulk", "Manager", 5000, "GWM");
        Ceo ceo = new Ceo("Sebolak", "CEO", 12000, "HO", 100);

        Employee person = new Manager();
        Manager worker = ceo;

        person.doWork();
        employee.printInfo();
        worker.printInfo();
        ceo.printInfo();
        manager.printInfo();
    }
}
