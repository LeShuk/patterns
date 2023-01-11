package decorator.decorator;

import decorator.component.HelloWorld;

/**
 * Базовый класс декоратора.
 * Содержит в себе декорируемый объект, который задается в конструкторе класса.
 */
public abstract class HelloWorldDecorator implements HelloWorld {
    private HelloWorld helloWorld;

    public HelloWorldDecorator(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String getHello() {
        return helloWorld.getHello();
    }
}
