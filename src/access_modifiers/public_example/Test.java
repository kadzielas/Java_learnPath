package access_modifiers.public_example;

import access_modifiers.public_example.package1.BasicClass;
import access_modifiers.public_example.package2.OtherClass;

public class Test {
    public static void main(String[] args) {

        BasicClass basicClass = new BasicClass();
        basicClass.name = "Basic";

        OtherClass otherClass = new OtherClass();
        otherClass.setName("Other");
    }
}
