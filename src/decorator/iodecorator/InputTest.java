package decorator.iodecorator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        String text = "I know the Decorator Pattern therefore I RULE!";

        InputStream in =
                new LowerCaseInputStream(
                        new ByteArrayInputStream(text.getBytes())
                );

        int c;

        try {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}