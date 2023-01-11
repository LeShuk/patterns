package decorator;

/**
 * Декоратор, который окружает заданный в конструкторе объект диезами.
 */
public class HelloWorldDecoratorWrapDies extends HelloWorldDecorator{
    HelloWorldDecoratorWrapDies(HelloWorld helloWorld) {
        super(helloWorld);
    }

    @Override
    public String getHello() {
        return wrapDies(super.getHello());
    }

    private String wrapDies(String src) {
        return "# " + src + " #";
    }
}
