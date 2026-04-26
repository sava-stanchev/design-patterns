package iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        // ArrayList
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            printMenuItem(menuItem);
        }

        // Array
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];

            if (menuItem != null) {
                printMenuItem(menuItem);
            }
        }
    }

    private static void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println(menuItem.getDescription());
    }
}