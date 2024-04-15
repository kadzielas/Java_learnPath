package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee{
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
}

public class HashMapBasics {
    public static void main(String[] args) {

        HashMap<String, Employee> map = new HashMap<>();
        map.put("Kowalski", new Employee("Adam"));
        map.put("Skonieczna", new Employee("Kasia"));
        map.put("Baczewska", new Employee("Magda"));

        Employee e = map.get("Kowalski");
        System.out.println(e);

        System.out.println("\n");
        System.out.println("While");

        Iterator i = map.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
            String key = (String) entry.getKey();
            Employee employee = (Employee)entry.getValue();
            System.out.println(key + " - " + employee);
        }

        System.out.println("\n");
        System.out.println("ForEach");

        for(Map.Entry<String, Employee> entry : map.entrySet()){
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(key + " - " + employee);
        }

    }
}
