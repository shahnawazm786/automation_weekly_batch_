package org.day7.absimpl;

public class AbstractImpl extends  AbstractExample{
    public static void main(String[] args) {

        AbstractExample ae=new AbstractImpl();
        System.out.println(ae.pie);
        System.out.println(ae.substract(100,200));
        ae.add(200,400);
        AbstractExample.exampleAbs();

    }

    @Override
    void add(int a, int b) {
        System.out.println("Adition");
    }
}
