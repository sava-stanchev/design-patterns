package singleton;

public class SingletonEnumTest {
    public static void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.UNIQUE_INSTANCE;
        SingletonEnum instance2 = SingletonEnum.UNIQUE_INSTANCE;

        System.out.println(instance1 == instance2);

        instance1.doSomething();
        instance2.doSomething();
    }
}