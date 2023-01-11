package decorator.decorator;

import decorator.component.HelloWorld;

/**
 * Декоратор, который окружает заданный в конструкторе объект звездочками
 */
public class HelloWorldDecoratorWrapAsterisk extends HelloWorldDecorator{

    public HelloWorldDecoratorWrapAsterisk(HelloWorld helloWorld) {
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
