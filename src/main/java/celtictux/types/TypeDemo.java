package celtictux.types;

import java.util.Scanner;

/**
 * Created by adamkelso on 10/05/17.
 */
public class TypeDemo {

    private final int primInteger = 1;
    private final Integer objInteger = new Integer(1);

    private String objString;

    private final boolean primBoolean = true;
    private final Boolean objBoolean = new Boolean(true);

    public static void main(final String[] args) {
        final TypeDemo demo = new TypeDemo();
        demo.runChecks();
    }

    public TypeDemo() {

    }

    public void runChecks() {
        System.out.println("Are Integer values the same: " + areIntegersSame(primInteger, objInteger));
        System.out.println("Are Boolean values the same: " + areBooleansSame(primBoolean, objBoolean));

        Scanner scanner =new Scanner(System.in);
        objString = scanner.next();
        System.out.println("Did you type: " + objString);
    }

    private boolean areIntegersSame(final int primative, final Integer object) {
        if (primative == object) {
            return true;
        } else {
            return false;
        }
    }

    private boolean areBooleansSame(final boolean primative, final Boolean object) {
        if (primative == object) {
            return true;
        } else {
            return false;
        }
    }

}
