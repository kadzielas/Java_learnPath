package Inheritance.super_example;

public final class Director extends Person{
    private int officeNum;

    public Director(String name, String surname, int officeNum) {
        super(name, surname);
        this.officeNum = officeNum;
    }

    public int getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(int officeNum) {
        this.officeNum = officeNum;
    }
}
