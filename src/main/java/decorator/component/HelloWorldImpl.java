package decorator.component;

/**
 * Реализация декорируемого компонента. Возвращает строку-приветствие.
 */
public class HelloWorldImpl implements HelloWorld{
    @Override
    public String getHello() {
        return "Hello, World!";
    }
}
