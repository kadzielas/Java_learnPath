package Inheritance.inheritance_ex_shop;

public class Computer extends Product{
    public Mouse mouse;
    public Keyboard keyboard;
    public Monitor monitor;

    Computer(){
        mouse = new Mouse();
        monitor = new Monitor();
        keyboard = new Keyboard();

    }
}
