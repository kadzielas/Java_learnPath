package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Animal3{
    private String name;

    @Override
    public String toString() {
        return "Animal3{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal3(String name) {
        this.name = name;
    }
}

public class HashMapChallenge {
    public static void main(String[] args) {

        HashMap<String, Animal3> map = new HashMap<>();
        String names[] = {"Dog", "Cat", "Goat", "Puma"};

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], new Animal3(names[i]));
        }

        System.out.println(map.get("Puma"));

        Iterator i = map.entrySet().iterator();
        for(Map.Entry<String, Animal3> x : map.entrySet()){
            String key = x.getKey();
            Animal3 value = x.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
