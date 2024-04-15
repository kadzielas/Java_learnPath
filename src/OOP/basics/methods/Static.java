package OOP.basics.methods;

class PlaneWithStatic {

    static int nextId = 1;
    int id;
    int x, y;
    static int getNextId(){
        return nextId++;
    }

    PlaneWithStatic(){
//        id = nextId;
//        nextId++;
        id = PlaneWithStatic.getNextId();
    }
}

public class Static {
    public static int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();



        System.out.println("Plane 1 next ID: " + plane1.id);
        System.out.println("Plane 2 ID: " + plane2.id);
        System.out.println("Plane 3 ID: " + plane3.id);
//        System.out.println("Plane next ID: " + PlaneWithStatic.nextId);
        System.out.println(Static.add(10,20));
        Static estatic = new Static();
        System.out.println(estatic.substract(10,6));
    }
}
