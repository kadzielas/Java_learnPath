package OOP.basics.methods;

class Radio {
    int year;
    int volume;
    String station;
    Radio(){
        this.year = 2000;
        volume = 100;
    }
    Radio(int year){
        this();
        this.year = year;
        this.changeStation("Rock");
    }
    public void changeStation(String newStation) {
        this.station = newStation;
    }
    public Radio getRadio(){
        return this;
    }
    public void printRadioInfo(Radio radio){
        System.out.println("Radio prodution year: " + radio.year);
    }
}

public class ThisUsage {
    public static void main(String[] args) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);
        newRadio.printRadioInfo(newRadio);

    }
}
