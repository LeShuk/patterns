package decorator;

import decorator.component.HelloWorld;
import decorator.component.HelloWorldImpl;
import decorator.decorator.HelloWorldDecoratorWrapAsterisk;
import decorator.decorator.HelloWorldDecoratorWrapDies;

public class MainDecorator {
    public static void main(String[] args) {
        //Все объекты - HelloWorld, инстанцированные соответствующими декораторами.

        HelloWorld simpleHello = new HelloWorldImpl();

        HelloWorld asteriskHello =
                new HelloWorldDecoratorWrapAsterisk(
                    new HelloWorldImpl());

        HelloWorld doubleAsteriskHello =
                new HelloWorldDecoratorWrapAsterisk(
                    new HelloWorldDecoratorWrapAsterisk(
                        new HelloWorldImpl()));

        HelloWorld allHello =
                new HelloWorldDecoratorWrapAsterisk(
                    new HelloWorldDecoratorWrapDies(
                        new HelloWorldImpl()));

        printHello(simpleHello);
        printHello(asteriskHello);
        printHello(doubleAsteriskHello);
        printHello(allHello);
    }

    private static void printHello(HelloWorld helloWorld) {
        System.out.println(helloWorld.getHello());
    }
}
