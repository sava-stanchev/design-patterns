package composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus =
                new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "Pancake Breakfast",
                "Pancakes with eggs",
                true,
                2.99
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59
        ));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "Fakin' Bacon with lettuce & tomato",
                true,
                2.99
        ));

        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato",
                false,
                2.99
        ));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flaky crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake with strawberry topping",
                true,
                1.99
        ));

        cafeMenu.add(new MenuItem(
                "Veggie Burger",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99
        ));

        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "Soup with a side salad",
                false,
                3.69
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}