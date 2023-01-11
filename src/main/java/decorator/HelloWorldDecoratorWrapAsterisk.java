package decorator;

/**
 * Декоратор, который окружает заданный в конструкторе объект звездочками
 */
public class HelloWorldDecoratorWrapAsterisk extends HelloWorldDecorator{

    HelloWorldDecoratorWrapAsterisk(HelloWorld helloWorld) {
        super(helloWorld);
    }

    @Override
    public String getHello() {
        return wrapAsterisk(super.getHello());
    }

    private String wrapAsterisk(String src) {
        return "* " + src + " *";
    }
}
