package decorator;

/**
 * Базовый класс декоратора.
 * Содержит в себе декорируемый объект, который задается в конструкторе класса.
 */
public abstract class HelloWorldDecorator implements HelloWorld{
    private HelloWorld helloWorld;

    HelloWorldDecorator(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String getHello() {
        return helloWorld.getHello();
    }
}
