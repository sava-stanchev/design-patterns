package proxy.image;

public class ImageTestDrive {
    public static void main(String[] args) {
        Image image = new ImageProxy("cat.png");

        System.out.println("\n--- First call ---");
        image.display();

        System.out.println("\n--- Second call ---");
        image.display();
    }
}