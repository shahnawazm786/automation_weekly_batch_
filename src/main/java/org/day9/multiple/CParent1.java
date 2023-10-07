package org.day9.multiple;

import org.day9.IParent;

public class CParent1 implements IParent {
    @Override
    public void first() {
        System.out.println("CParent1 of first");
    }

    @Override
    public void second() {
        System.out.println("CParent1 of second");
    }

    @Override
    public void third() {
        System.out.println("CParent1 of third");
    }
}
