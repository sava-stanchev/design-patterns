package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationTestDrive {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        Enumeration<String> enumeration = vector.elements();

        Iterator<?> iterator = new EnumerationIterator(enumeration);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}