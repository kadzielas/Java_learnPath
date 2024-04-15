package modifiers;

public class Bike {
    public String brand;
    protected String name;
    private String type;

    Bike(){

    }
    Bike(String brand, String name){
        this.brand = brand;
        this.name = name;
        this.type = "Bike";
    }

    public String setType(String type){
        this.type = type;
        return type;
    }

    public void printInfo(){
        System.out.println(this.brand + " " + this.name + " " + this.type);
    }


}
