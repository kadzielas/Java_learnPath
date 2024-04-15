package OOP.interface_extends_defaultStaticFinal;

public interface Flying {
    public static final float DEFAULT_WINGSPAN = 0.7f;
    public void fly();
    public default void flyHigher(){
        System.out.println("Flying higher");
    }

    public default float getDefaultWingspan(){
        return DEFAULT_WINGSPAN;
    }

    public static int getDefaultNumWings(){
        return 2;
    }
}
