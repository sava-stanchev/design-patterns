package templatemethod.list;

import java.util.List;

public class ListTestDrive {
    public static void main(String[] args) {
        String[] data = {"One", "Two", "Three", "Four", "Five"};

        MyStringList list = new MyStringList(data);

        System.out.println("Original list:");
        display(list);

        System.out.println("\nUpdating index 1...");
        String oldValue = list.set(1, "Updated");
        System.out.println("Replaced: " + oldValue);

        System.out.println("\nList after update:");
        display(list);

        System.out.println("\nSublist (1 to 4):");
        List<String> subList = list.subList(1, 4);
        display(subList);
    }

    private static void display(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}