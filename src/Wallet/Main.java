package Wallet;

class Wallet {
    float money = 3000f;
    float amount;

    public void addMoney(float value) {
        money += value;
    }

    public void removeMoney(float value) {
        money -= value;
    }

    public void printAmount(String month) {
        System.out.println(month + ": " + money);
    }
}

public class Main {
    public static void main(String[] args) {

        String months[] = {"February", "March", "April", "May", "June", "July"};
        float a = 5000f;
        float b = 2000f;
        float c = 1000f;

        Wallet wallet = new Wallet();
        wallet.money = 3000f;

        for (int i = 0; i < months.length; i++) {
            wallet.addMoney(a);
            wallet.removeMoney(b);
            wallet.removeMoney(c);
            wallet.printAmount(months[i]);
        }
    }
}
