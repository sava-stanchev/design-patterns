package proxy.image;

public class ImageProxy implements Image {
    private RealImage realImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("[Proxy] First access → loading real image");
            realImage = new RealImage(filename);
        } else {
            System.out.println("[Proxy] Reusing cached image");
        }

        realImage.display();
    }
}